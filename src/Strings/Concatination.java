package Strings;

public class Concatination {
    public static void main(String[] args) {
        // String concatenation
        String concatFirst = "Concat";
        String concatSecond = "strings";

        // Not efficient - keeps resulting string in memory
        System.out.println(concatFirst + " " + concatSecond);

        // Will not have a space between
        System.out.println(concatFirst.concat(concatSecond));

        // With builder - more efficient (in loops for example)
        // StringBuilder can get a parameter of a length of final string -
        // StringBuilder(concatFirst.length() + concatSecond.length() + 1)
        String finalString = new StringBuilder()
                .append(concatFirst)
                .append(" ")
                .append(concatSecond)
                .toString();
        System.out.println(finalString);

        // Old way with StringBuffer - less efficient as it is trade safe
        String finalBuffer = new StringBuffer()
                .append(concatFirst)
                .append(" ")
                .append(concatSecond)
                .toString();
        System.out.println(finalBuffer);

        // String literals
        String finalLiteral = String.format("%s %s", concatFirst, concatSecond);
        System.out.println(finalLiteral);

        // Format in output
        System.out.format("%s %s\n", concatFirst, concatSecond);
    }
}
