package Strings;

public class Substring {
    public static void main(String[] args) {
        // substring
        String str = "apple";

        String firstLetter = str.substring(0, 1); // "a"
        String restPart = str.substring(1); // "pple"

        System.out.println(firstLetter.toUpperCase().concat(restPart));
    }
}
