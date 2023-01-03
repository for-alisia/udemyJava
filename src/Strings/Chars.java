package Strings;

public class Chars {
    public static void main(String[] args) {
        // charAt
        String apple = "apple";
        int length = apple.length();
        if (length > 100) {
            System.out.println(apple.charAt(100)); // throws an exception as index is out of boundaries
        }
        System.out.println(apple.charAt(3));

        // toCharArray()
        char[] myChars = apple.toCharArray(); // ['a', 'p', 'p', 'l', 'e']
    }
}
