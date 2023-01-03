package Strings;

public class Blank_Empty {
    public static void main(String[] args) {
        // Difference between isEmpty and isBlank
        String empty = "";
        String blank = " ";

        // Empty - check if the length is 0
        System.out.println(empty.isEmpty()); // true
        System.out.println(blank.isEmpty()); // false

        // Blank - counts meaningful chars, whitespace is not meaningful char
        System.out.println(blank.isBlank()); // true
        System.out.println(empty.isBlank()); // true
    }
}
