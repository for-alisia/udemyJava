package pro.elenaromanova.guessingGame;

import java.util.Random;

public class GuessingGame {
    private final int rndNumber = new Random().nextInt(10) + 1;
    private int counter = 0;
    public String guess(int guessNum) {
        counter++;

        String tryText = counter == 1 ? "try" : "tries";
        String msg = String.format("You got it in %d %s!", counter, tryText);
        boolean isGuessed = guessNum == getRndNumber();
        String response;

        if (counter == 4 && !isGuessed) {
            response = String.format("The game is over. You used %d %s", counter, tryText);
        } else if (counter > 4) {
            response = "The game is over. You are limited only 4 tries";
        } else {
            String additionalMsg = guessNum > getRndNumber() ? "Too high!" : "Too low!";
            response = isGuessed ? msg : String.format("Please try again! %s", additionalMsg);
        }

        return response;
    }

    public int getRndNumber() {
        return rndNumber;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        boolean loopShouldContinue = true;
        do {
            String input = System.console().readLine("Enter a number: ");
            if ("q".equals(input)) {
                return;
            }
            String output = game.guess(Integer.parseInt(input));

            System.out.println(output);

            if (output.contains("You got it") || output.contains("over")) {
                loopShouldContinue = false;
            }
        } while (loopShouldContinue);

    }
}
