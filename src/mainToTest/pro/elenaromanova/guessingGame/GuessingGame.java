package pro.elenaromanova.guessingGame;

public class GuessingGame {
    public String guess(int guessNum) {
        return guessNum == getRndNumber() ? "You got it!" : "Please try again!";
    }

    public int getRndNumber() {
        return 0;
    }
}
