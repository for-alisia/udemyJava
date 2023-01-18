package pro.elenaromanova.guessingGame;

import java.util.Random;

public class GuessingGame {
    private final int rndNumber = new Random().nextInt(10) + 1;
    public String guess(int guessNum) {
        return guessNum == getRndNumber() ? "You got it!" : "Please try again!";
    }

    public int getRndNumber() {
        return rndNumber;
    }
}
