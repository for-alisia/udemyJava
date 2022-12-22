public class StringExamples {
    private String myString = "My string";

    public static void main(String[] args) {
        // In Java Strings are Objects
        // String literals:
        // firstString and anotherFirstString have the same reference to memory (the same object)
        String firstString = "My first string";
        String anotherFirstString = "My first string";
        System.out.println(firstString == anotherFirstString);  // true
        // secondString and anotherSecondString are different objects in memory
        // Java will not check for existence
        String secondString = new String("My second string");
        String anotherSecondString = new String("My second string");
        System.out.println(secondString == anotherFirstString); // false

        // Upper case
        String myText = "some text";
        System.out.println(myText.toUpperCase());
        // Lower case
        String myBigText = "TEXT";
        System.out.println(myBigText.toLowerCase());
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
