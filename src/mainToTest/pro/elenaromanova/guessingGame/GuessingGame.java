package pro.elenaromanova.guessingGame;

import java.util.Random;

public class GuessingGame {
    private final int rndNumber = new Random().nextInt(10) + 1;
    private int counter = 0;
    public String guess(int guessNum) {
        counter++;
        boolean isGuessed = guessNum == getRndNumber();
        if (counter >= 4 && !isGuessed) {
            return "The game is over. You used all tries";
        }
        String tryText = counter == 1 ? "try" : "tries";
        String msg = String.format("You got it in %d %s!", counter, tryText);
        return isGuessed ? msg : "Please try again!";
    }

    public int getRndNumber() {
        return rndNumber;
    }
}
