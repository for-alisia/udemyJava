package ControlFlow;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        String approach = System.console().readLine("Please put 1, 2, 3, 4 or 5 to choose a loop: %n");

        int rndNum = new Random().nextInt(10) + 1;
        boolean isGuessed = false;
        String guessedNumberStr = null;
        int maxAllowedTries = 4;

        System.out.println("Number is: " + rndNum);

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

                do {
                    guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
                    attempts++;
                    if (guessedNumberStr.matches("-?\\d{1,2}")) {
                        int guessedNumber = Integer.parseInt(guessedNumberStr);
                        if (guessedNumber == rndNum || attempts >= maxAllowedTries) {
                            String endText = guessedNumber == rndNum ? "Congrats!" : "Sorry, you used all attempts and lost...";
                            System.out.printf("%s The number is %d. %n", endText, rndNum);
                            // We can use also "break" here
                            return;
                        } else {
                            String tries = attempts == 1 ? "attempt" : "attempts";
                            System.out.printf("Sorry, you used %d %s, try again!%n", attempts, tries);
                        }
                    }
                } while (!"q".equals(guessedNumberStr));
            case "4":
                // For-loop
                int att = 1;
                // If we need to keep counter outside the loop we can skip first clause (;)
                for (; att < maxAllowedTries; att++) {
                    guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
                    if (guessedNumberStr.equals("q")) {
                        System.out.println("Ending the game...");
                        return;
                    }
                    if (!guessedNumberStr.matches("-?\\d{1,2}")) {
                        System.out.println("Please provide a number from 1 to 10!");
                        // "Continue" allows to go directly to next iteration
                        continue;
                    }
                    int guessedNumber = Integer.parseInt(guessedNumberStr);
                    if (guessedNumber == rndNum) {
                        System.out.printf("Congrats! The number is %d. %n", rndNum);
                        // "Return" throws out of the method (here the whole app)
                        // "Break" throws only out of the loop
                        break;
                    } else {
                        String tries = att == 1 ? "attempt" : "attempts";
                        System.out.printf("Sorry, you used %d %s, try again!%n", att, tries);
                    }
                }

                if (att >= maxAllowedTries) {
                    System.out.printf("Number is %d, sorry, you used all %d tries %n", rndNum, maxAllowedTries);
                }
            case "5":
                // Enhanced for/loop
                String[] fruits = {"apple", "lemon", "orange", "pear"};
                for (String fruit: fruits) {
                    System.out.println(fruit);
                }
        }
    }
}
