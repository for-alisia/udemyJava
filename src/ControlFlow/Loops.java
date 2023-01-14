package ControlFlow;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        String approach = System.console().readLine("Please put 1, 2 or 3 to choose a loop: %n");

        int rndNum = new Random().nextInt(10) + 1;
        boolean isGuessed = false;
        String guessedNumberStr = null;

        switch(approach) {
            case "1":
                // Classic while loop - endless tries, without return
                while (!isGuessed && !"q".equals(guessedNumberStr)) {
                    guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
                    if (guessedNumberStr.matches("-?\\d{1,2}")) {
                        int guessedNumber = Integer.parseInt(guessedNumberStr);

                        if (guessedNumber == rndNum) {
                            System.out.println("You've got it!");
                            // Instead of boolean we can just return here (without value) and it breaks the loop
                            isGuessed = true;
                        } else {
                            System.out.println("Sorry, try again!");
                        }
                    }
                }
            case "2":
                // Second option (easier to read) - but app can blow up if user will provide not q or integer
                while(true) {
                    guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
                    if (guessedNumberStr.equals("q")) {
                        return;
                    }

                    int guessedNumber = Integer.parseInt(guessedNumberStr);

                    if (guessedNumber == rndNum) {
                        System.out.println("You've got it!");
                        return;
                    } else {
                        System.out.println("Sorry, try again!");
                    }
                }
            case "3":
                // With do-while
                int attempts = 0;
                int maxAllowedTries = 4;

                do {
                    guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
                    attempts++;
                    if (guessedNumberStr.matches("-?\\d{1,2}")) {
                        int guessedNumber = Integer.parseInt(guessedNumberStr);
                        if (guessedNumber == rndNum || attempts >= maxAllowedTries) {
                            String endText = guessedNumber == rndNum ? "Congrats!" : "Sorry, you used all attempts and lost...";
                            System.out.printf("%s The number is %d. %n", endText, rndNum);
                            return;
                        } else {
                            String tries = attempts == 1 ? "attempt" : "attempts";
                            System.out.printf("Sorry, you used %d %s, try again!%n", attempts, tries);
                        }
                    }
                } while (!"q".equals(guessedNumberStr));
        }
    }
}
