package Numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CompoundInterestCalc {
    public static void main(String[] args) {
        BigDecimal compound = calculate("10000", "0.08", 10, "1000");

        System.out.println(compound);
    }

    public static BigDecimal calculate(String principle, String rate, int period, String contribution) {
        MathContext mc = new MathContext(8, RoundingMode.HALF_UP);
        BigDecimal ratePlus = BigDecimal.ONE.add(new BigDecimal(rate)); // 1 + r
        BigDecimal ratePlusInPer = ratePlus.pow(period); // (1 + r)^Y
        BigDecimal rateSubstract = ratePlusInPer.subtract(BigDecimal.ONE);
        BigDecimal rateDivided = rateSubstract.divide(new BigDecimal(rate), mc);
        BigDecimal rateContribution = rateDivided.multiply(new BigDecimal(contribution));

        return ratePlusInPer.multiply(new BigDecimal(principle)).add(rateContribution);
    }
}
