package pro.elenaromanova.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);

        assertEquals(0, sum, "Was expecting to be 0");
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);

        assertEquals(2, sum);
    }

    @Test
    public void canAddNegativePlusPositive() {
        int sum = calc.add(-3, 6);

        assertEquals(3, sum);
    }

    @Test
    public void canAddNegativePlusNegative() {
        int sum = calc.add(-1, -4);

        assertEquals(-5, sum);
    }

    @Test
    @Disabled
    // @Ignore - earlier than JUnit 5
    public void canAddMaxIntPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        // Failing test - we have a bug here
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

    @Test
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, "0.06", 1);

        assertEquals("$184,664.43", answer);
    }

    @Test
    public void annuityPractice2() {
        String answer = calc.calcAnnuity("1200", 10, "0.08", 4);

        assertEquals("$72,482.38", answer);
    }
}
