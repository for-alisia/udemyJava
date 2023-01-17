package pro.elenaromanova.calculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public String calcAnnuity(String income, int period, String rate, int compoundTime ) {
        BigDecimal rateToCompound = new BigDecimal(rate).divide(new BigDecimal(compoundTime));
        BigDecimal b = BigDecimal.ONE.add(rateToCompound);
        BigDecimal c = b.pow(compoundTime * period);
        BigDecimal d = c.subtract(BigDecimal.ONE);
        BigDecimal e = d.divide(rateToCompound);
        BigDecimal f = e.multiply(new BigDecimal(income));

        NumberFormat numFormat = NumberFormat.getCurrencyInstance(Locale.US);

        return numFormat.format(f);
    }
}
