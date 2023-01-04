package RegExp;

public class CharacterClasses {
    public static void main(String[] args) {
        // . represents any character at all
        // ^ (outside []) means beginning of the string (line)
        // $ means ends of the string (maybe new line also - \n)
        // \b (\\b) - boundary symbol (before/after word begins/ends), but not a space!
        // \w (\\w) - word character
        // \W (\\W) - anything other then word character (but not numbers as well)
        // \d (\\d) - digits
        // \D (\\D) - not digits
        // \s (\\s) - space
        // \S (\\S) - not a space
        System.out.println("dog".matches("^.+$")); // true
        System.out.println("c a".matches(".\\b\\s\\b.")); //true
        System.out.println("abc".matches("\\w\\w\\w")); //true
        System.out.println("a-a".matches("\\w\\W\\w")); //true
        System.out.println("111".matches("\\d\\d\\d")); //true
        System.out.println("1.1".matches("\\d\\D\\d")); //true
        System.out.println("1 1".matches("\\d\\s\\d")); //true
        System.out.println("1&1".matches("\\d\\S\\d")); //true
    }
}
