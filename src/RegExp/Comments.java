package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comments {
    public static void main(String[] args) {
        String phoneNumber = "(48) 312-048";

        String regExp = """
            # RegExp for number like: 11-111-111 or 11 111 111
            (\\(?(?<countryCode>\\d{2})\\)?[-\\s]?)? # Get's country code
            ((?<firstPart>\\d{3})[-\\s]?) # Get's area code (second part of number)
            (?<secondPart>\\d{3}) # Get's line number (last part of a number)
            """;

        //   As a second param we can pass a flag - flags are available as constants on Pattern class
        // N! With comments regExp should have \\s instead of actual space inside, as it will not work
        // For example for string "I am a developer" regExp should be "I\\sam\\sa\\sdeveloper"
        // In "usual" mode without comments we can use explicit spaces in regExp (but generally it's a bad practice)
        Pattern regPat = Pattern.compile(regExp, Pattern.COMMENTS);
        Matcher regMat = regPat.matcher(phoneNumber);

        if (regMat.matches()) {
            System.out.format("Country code: %s\n", regMat.group("countryCode"));
            System.out.format("Your phone number is: (%s)(%s)\n", regMat.group("firstPart"), regMat.group("secondPart"));
        }

    }
}
