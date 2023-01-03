package Strings;

public class ChangeCase {
    public static void main(String[] args) {
        String firstString = "My First String";
        // Upper case
        System.out.println(firstString.toUpperCase()); // "MY FIST STRING"
        // Lower case
        System.out.println(firstString.toLowerCase()); // "my first string"
        // Also we can pass a locale as arg in case we are working with not latin languages
    }
}
