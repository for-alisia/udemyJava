package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatch {
    public static void main(String[] args) {
        String people = """
                Anna, Doe, 11/02/1976
                John, Smith, 23/09/1999
                Max, Jonas, 16/11/1987
                """;
        String regEx = "(?<firstName>\\w+),\\s*(?<lastName>\\w+),\\s*(?<birthdate>\\d{1,2}/\\d{1,2}/\\d{4})\\n";

        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(people);


        // find method returns a boolean if there is the next match - so we can iterate
        // through all matched entities
        // we can pass an arg - number of chars to skip from beginning
        while(mat.find()) {
            System.out.println(mat.group("firstName")); // Anna
            System.out.println(mat.group("lastName")); // Doe
            System.out.println(mat.group("birthdate")); // 11/02/1976
            System.out.println("Starts at:" + mat.start());
            System.out.println("Ends at:" + mat.end());
            System.out.println("Lastname starts at:" + mat.start("lastName"));
            System.out.println("Lastname ends at:" + mat.end("lastName"));
            System.out.println("---------------");
        }
    }
}
