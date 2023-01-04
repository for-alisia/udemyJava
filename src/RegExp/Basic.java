package RegExp;

import java.util.regex.Pattern;

public class Basic {
    public static void main(String[] args) {
        // Basic
        System.out.println("cat".matches("cat")); // true
        System.out.println("cat".matches("Cat")); // false (case-sensitive)
        // []
        System.out.println("Cat".matches("[Cc]at")); // true (Cat or cat)
        System.out.println("bat".matches("[Cbc]at")); // true (Cat, cat or bat)
        System.out.println("bat".matches("[a-f]at")); // true (range from a to f)
        System.out.println("bat".matches("[a-fA-F]at")); // true (range from a to f and A to F)
        System.out.println("bat".matches("[^b]at")); // false (first symbol - everything except b)
        System.out.println("#at".matches("[^a-z]at")); // true (not in range from a to z)

        // \w - word character (we need to escape backward slash in Java) - letters, _ and numbers
        System.out.println("Cat".matches("\\wat")); // any string with first word char and at

        // \d - digits character
        System.out.println("1at".matches("\\dat")); // \d allows only digits
        System.out.println("31-23".matches("\\d\\d-\\d\\d")); // true (repetitive)

        // \s - space character + quantifiers - {}, +, *, ?
        // {3} - 3 chars, {2,3} - 2 or 3 chars, {2,} - 2 or more (no upper limit)
        // + - one or more, * - zero or more, ? - zero or one
        System.out.println("31-048".matches("\\d{2}[-\\s]\\d{3}")); // true - with quantifier - delimiter can be - or space
        System.out.println("31   048".matches("\\d{2}[-\\s]+\\d{3}")); // true - with quantifier - delimiter can be one or more - or space
        System.out.println("31048".matches("\\d{2}[-\\s]*\\d{3}")); // true - with quantifier - delimiter can be zero or more - or space
        System.out.println("31-048".matches("\\d{2}[-\\s]?\\d{3}")); // true - with quantifier - delimiter can be zero or one - or space
        System.out.println("312-048".matches("\\d{2,3}[-\\s]?\\d{3}")); // true
        System.out.println("31223-048".matches("\\d{2,}[-\\s]?\\d{3}")); // true
        System.out.println("11-11-11".matches("(\\d{2}-?){3}")); // true - (...){2} - grouping

        // To use special symbols like ()*? as literals, we need to escape them with \\
    }
}
