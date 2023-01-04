package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegGrouping {
    public static void main(String[] args) {
        String phoneNumber = "48 312-048-572";
        // Brackets in regex () create groups
        // These groups could have their own quantifiers (){2,3}
        // But groups with quantifiers could not be picked up by group() method
        String regex = "(\\d{1,2}[-\\s]?)?(\\d{3}[-\\s]?){3}";
        // Now let's get rid of quantifiers for groups
        // But we still have delimiters included
        String correctedRegEx = "(\\d{2}[-\\s]?)?(\\d{3}[-\\s]?)(\\d{3}[-\\s]?)(\\d{3}[-\\s]?)";
        // To get rid of delimiters we need to regroup - we can embed groups
        // But in this case we will have more groups with not so clear numbers
        String finalRegEx = "((\\d{2})[-\\s]?)?((\\d{3})[-\\s]?)((\\d{3})[-\\s]?)(\\d{3}?)";
        // We can tell engine not to capture some groups with this syntax ?:
        String groupRegEx = "(?:(\\d{2})[-\\s]?)?(?:(\\d{3})[-\\s]?)(?:(\\d{3})[-\\s]?)(\\d{3}?)";
        // Another option - to add named groups with syntax ?<nameOfTheGroup>
        String namedGroupRegEx = "((?<countryCode>\\d{2})[-\\s]?)?((?<firstPart>\\d{3})[-\\s]?)((?<secondPart>\\d{3})[-\\s]?)(?<thirdPart>\\d{3}?)";
        // We can't create instance of pattern with new!
        Pattern withQuantifPat = Pattern.compile(regex);
        Pattern pat = Pattern.compile(correctedRegEx);
        Pattern finalPat = Pattern.compile(finalRegEx);
        Pattern groupPat = Pattern.compile(groupRegEx);
        Pattern namedPat = Pattern.compile(namedGroupRegEx);
        // We use matcher to check if string matches regex
        Matcher withQuantifMat = withQuantifPat.matcher(phoneNumber);
        Matcher mat = pat.matcher(phoneNumber);
        Matcher finalMat = finalPat.matcher(phoneNumber);
        Matcher groupMat = groupPat.matcher(phoneNumber);
        Matcher namedMat = namedPat.matcher(phoneNumber);

        System.out.println("Initial with groups and quantifiers");

        if (withQuantifMat.matches()) {
            System.out.println(withQuantifMat.group(1)); // 48
            System.out.println(withQuantifMat.group(2)); // 572 (returns last el in group)
            // Here as we are using quantifier for the group, we are losing fist 2 repetitions (312-048)
            // as group will return only last repetition (572)
            // To solve this issue we need manually copy groups to get rid of quantifiers there
        }

        System.out.println("With individual groups and delimiters");

        if (mat.matches()) {
            System.out.println(mat.group(1)); // 48
            System.out.println(mat.group(2)); // 312-
            System.out.println(mat.group(3)); // 048-
            System.out.println(mat.group(4)); // 572
            System.out.println(mat.group(0)); // 48 312-048-572 - 0 group is a whole string
            // Here everything is ok except delimiters - we need to get rid of them
        }

        System.out.println("Final version");

        if (finalMat.matches()) {
            System.out.println(finalMat.group(1)); // 48
            System.out.println(finalMat.group(2)); // 48
            System.out.println(finalMat.group(3)); // 312-
            System.out.println(finalMat.group(4)); // 312
            System.out.println(finalMat.group(5)); // 048-
            System.out.println(finalMat.group(6)); // 048
            System.out.println(finalMat.group(7)); // 572

            System.out.format("Country code: %s\n", finalMat.group(2));
            System.out.format("Your phone number is: (%s)(%s)(%s)\n", finalMat.group(4), finalMat.group(6), finalMat.group(7));
            // Here we already got a final result, but groups numbers are not clear as we are capturing all groups
            // Even if we do not need them
        }

        System.out.println("Only with certain groups");

        if (groupMat.matches()) {
            System.out.println(groupMat.group(1)); // 48
            System.out.println(groupMat.group(2)); // 312
            System.out.println(groupMat.group(3)); // 048
            System.out.println(groupMat.group(4)); // 572
            // But using a numbers could be confusing and hard to maintain
        }

        System.out.println("With named groups");

        if (namedMat.matches()) {
            // Preferred way - we can use named groups to reference certain parts of our regExp
            System.out.println(namedMat.group("countryCode")); // 48
            System.out.println(namedMat.group("firstPart")); // 312
            System.out.println(namedMat.group("secondPart")); // 048
            System.out.println(namedMat.group("thirdPart")); // 572
        }
    }
}
