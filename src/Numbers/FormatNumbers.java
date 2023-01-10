package Numbers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.US);

    public static void main(String[] args) throws ParseException {
        System.out.println(moneyFormatter.format(new BigDecimal("23.06456")));
        System.out.println(moneyFormatter.parse("$23,568.89"));
        System.out.println(percentFormatter.format(0.087));
        System.out.println(percentFormatter.parse("8%"));

        DecimalFormat df = new DecimalFormat("$#,###.00;$(#)");
        System.out.println(df.format(-34235.987));
        System.out.println(df.format(34235.987));

        DecimalFormat pf = new DecimalFormat("#%");
        System.out.println(pf.format(0.08));

        // We can also use String.format() with the same syntax
        System.out.printf("$%,(.2f%n", new BigDecimal("3567.2390").negate());
        System.out.printf("$%,(.2f%n", new BigDecimal("3567.2390"));

    }
}
