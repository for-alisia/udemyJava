package Strings;

public class Comparing {
    public static void main(String[] args) {
        // compareTo - returns negative int if first word before in alphabet
        // 0 - the same words
        // positive - if second word earlier alphabetically
        String fruit = "apple";
        String vegetable = "broccoli";

        System.out.println(fruit.compareTo(vegetable)); // -1
        System.out.println(fruit.compareToIgnoreCase(vegetable)); // non-case-sensitive

        // Check equality - contentEquals or equals
        String str1 = "apple";
        String str2 = "apple";
        StringBuffer str3 = new StringBuffer("apple");
        StringBuilder str4 = new StringBuilder("apple!");

        // contentEquals can compare strings and string and char sequences
        System.out.println(str1.contentEquals(str3)); // true
        System.out.println(str1.contentEquals(str4)); // false
        System.out.println(str1.contentEquals(str2)); // true
        // equals can compare only 2 strings
        System.out.println(str1.equals(str2)); // true
    }
}
