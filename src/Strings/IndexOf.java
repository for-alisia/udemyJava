package Strings;

public class IndexOf {
    public static void main(String[] args) {
        String myText = "My name is Elena";

        // Stops when finds the first match (case-sensitive)
        // If n matches - returns -1
        System.out.println(myText.indexOf("Elena")); // 11
        System.out.println(myText.indexOf(65)); // We can pass a code of char as arg, -1 (65 does not here)
        System.out.println(myText.lastIndexOf("na")); // looks from the end - 14
        System.out.println(myText.indexOf("a", 7)); // skips 7 chars - 15
    }
}
