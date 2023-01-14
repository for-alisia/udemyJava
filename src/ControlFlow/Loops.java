package ControlFlow;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        int rndNum = new Random().nextInt(10) + 1;
        boolean isGuessed = false;
        String guessedNumberStr = null;

//        while (!isGuessed && !"q".equals(guessedNumberStr)) {
//           guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
//            if (guessedNumberStr.matches("-?\\d{1,2}")) {
//                int guessedNumber = Integer.parseInt(guessedNumberStr);
//
//                if (guessedNumber == rndNum) {
//                    System.out.println("You've got it!");
//                    // Instead of boolean we can just return here (without value) and it breaks the loop
//                    isGuessed = true;
//                } else {
//                    System.out.println("Sorry, try again!");
//                }
//            }
//        }

        // Second option (easier to read) - but app can blow up if user will provide not q or integer
//        while(true) {
//            guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");
//            if (guessedNumberStr.equals("q")) {
//                return;
//            }
//
//            int guessedNumber = Integer.parseInt(guessedNumberStr);
//
//            if (guessedNumber == rndNum) {
//                System.out.println("You've got it!");
//                return;
//            } else {
//                System.out.println("Sorry, try again!");
//            }
//        }

        int attempts = 0;
        // With do-while
        do {
            guessedNumberStr = System.console().readLine("Please put a number between 1 and 10 inclusively %n");

            if (guessedNumberStr.matches("-?\\d{1,2}")) {
                int guessedNumber = Integer.parseInt(guessedNumberStr);

                if (guessedNumber == rndNum) {
                    System.out.println("You've got it!");
                    return;
                } else {
                    attempts++;
                    String tries = attempts == 1 ? "attempt" : "attempts";
                    System.out.printf("Sorry, you used %d %s, try again!%n", attempts, tries);
                }
            }

        } while (!"q".equals(guessedNumberStr));
    }
}
