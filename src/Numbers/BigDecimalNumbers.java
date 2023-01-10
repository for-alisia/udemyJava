package Numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalNumbers {
    public static void main(String[] args) {
        float numf1 = 2.15f;
        float numf2 = 1.1f;

        System.out.println(numf1 - numf2); // 1.05000001

        // For accurate calculations - BigInteger and BigDecimal are more costly.
        // If it's ok, primitive types should be used
        BigDecimal num1 = new BigDecimal("2.15");
        BigDecimal num2 = new BigDecimal("1.1");

        System.out.println(num1.subtract(num2)); // 1.05

        // Methods
        // We need MathContext to set precision and round method
        // as even with BigDecimal we can have infinite amount of float part (with division for example)
        MathContext mc = new MathContext(8, RoundingMode.HALF_UP);
        BigDecimal result = new BigDecimal(".314566")
                .add(new BigDecimal("2.754"))
                .subtract(new BigDecimal(".782"))
                .divide(new BigDecimal("5.31234"), mc)
                .sqrt(mc);

        System.out.println(result);

        // We can instantiate BigDecimal with double or other primitive types for numbers,
        // but we will have loss of precision
        // Better to avoid it
        BigDecimal notPrecise = new BigDecimal(3.1253557);

        // Converting from BigDecimal
        System.out.println(result.byteValue()); // 0 (as we have a big not round number)
        System.out.println(result.doubleValue()); // 0.65606813 (here we have precise output)
        System.out.println(result.intValue()); // 0
        System.out.println(result.toString()); // "0.65606813"
    }
}
