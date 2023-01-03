package Strings;

public class Creation {
    public static void main(String[] args) {
        // In Java Strings are Objects
        // String literals:
        // firstString and anotherFirstString have the same reference to memory (the same object)
        String firstString = "My first string";
        String anotherFirstString = "My first string";
        System.out.println(firstString == anotherFirstString);  // true

        // Multiline strings:
        String multiline = """
                Anna,Doe,1985,Atlanta,USA
                John,Smith,1960,London,UK
                Karolina,Krzyszek,Krakow,Poland
                """;
        System.out.println(multiline);

        // Strings created with new keyword:
        // secondString and anotherSecondString are different objects in memory
        // Java will not check for existence
        String secondString = new String("My second string");
        String anotherSecondString = new String("My second string");
        System.out.println(secondString == anotherSecondString); // false

        // With builder - more efficient (in loops for example)
        // StringBuilder can get a parameter of a length of final string -
        // StringBuilder(concatFirst.length() + concatSecond.length() + 1)
        String first = "first";
        String second = "second";
        String finalString = new StringBuilder()
                .append(first)
                .append(" ")
                .append(second)
                .toString();
        System.out.println(finalString);

        // Old way with StringBuffer - less efficient as it is trade safe
        String finalBuffer = new StringBuffer()
                .append(first)
                .append(" ")
                .append(second)
                .toString();
        System.out.println(finalBuffer);

        // String literals
        String finalLiteral = String.format("%s %s", first, second);
        System.out.println(finalLiteral);

        // Format in output
        System.out.format("%s %s\n", first, second);
    }
}
