package pro.elenaromanova.guessingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

    private GuessingGame game;
    private static final int RND_GENERATOR_TRIES = 100;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int rndNumber = game.getRndNumber();
        String msg = game.guess(rndNumber);

        assertEquals("You got it in 1 try!", msg);
    }

    @Test
    public void testWrongGuessNegSituation() {
        String msg = game.guess(-5);

        assertEquals("Please try again! Too low!", msg);
    }

    @Test
    public void testWrongGuessPosSituation() {
        int rndNumber = game.getRndNumber();
        String msg = game.guess(rndNumber + 1);

        assertEquals("Please try again! Too high!", msg);
    }


    @RepeatedTest(5)
    public void testRandomNumberGeneration() {
        int[] arr = new int[11];
        for (int counter = 0; counter < RND_GENERATOR_TRIES; counter++) {
            GuessingGame newGame = new GuessingGame();
            int rndNumber = newGame.getRndNumber();
            arr[rndNumber] = 1;
        };

        int sum = 0;
        for (int counter = 0; counter < 11; counter++) {
            sum += arr[counter];
        }

        assertEquals(10, sum);
    }

    @Test
    public void testFourWrongGuesses() {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result = game.guess(-3);
        }

        assertEquals("The game is over. You used 4 tries", result);
    }

    @Test
    public void testTenWrongGuesses() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result = game.guess(-3);
        }

        assertEquals("The game is over. You are limited only 4 tries", result);
    }

    @Test
    public void testThreeWrongAndCorrectGuesses() {
        String result = "";
        for (int i = 0; i < 4; i++) {
            int guess =  i == 3 ? game.getRndNumber() : -3;
            result = game.guess(guess);
        }

        assertEquals("You got it in 4 tries!", result);
    }

    @Test
    public void testTwoWrongAndCorrectGuesses() {
        String result = "";
        for (int i = 0; i < 3; i++) {
            int guess =  i == 2 ? game.getRndNumber() : -3;
            result = game.guess(guess);
        }
        assertTrue(result.contains(" 3 "), "Should contain 3 for tries");
        assertEquals("You got it in 3 tries!", result);
    }
}
