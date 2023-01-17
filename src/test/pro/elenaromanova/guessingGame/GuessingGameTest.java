package pro.elenaromanova.guessingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int rndNumber = game.getRndNumber();
        String msg = game.guess(rndNumber);

        assertEquals("You got it!", msg);
    }

    @Test
    public void testWrongGuessNegSituation() {
        String msg = game.guess(-5);

        assertEquals("Please try again!", msg);
    }

    @Test
    public void testWrongGuessPosSituation() {
        int rndNumber = game.getRndNumber();
        String msg = game.guess(rndNumber + 1);

        assertEquals("Please try again!", msg);
    }

    @Test
    public void testRandomNumberGeneration() {
        int[] arr = new int[11];
        for (int counter = 0; counter < 100; counter++) {
            int rndNumber = game.getRndNumber();
            arr[rndNumber] = 1;
        };

        int sum = 0;
        for (int counter = 0; counter < 11; counter++) {
            sum += arr[counter];
        }

        assertEquals(10, sum);
    }
}
