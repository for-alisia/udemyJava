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
        System.out.println(secondString == anotherSecondString); // false

        StringExamples myEx = new StringExamples();

        // To check info about string methods
        // go to specific method of this class
        myEx.workingWithChars();
        myEx.blankOrEmpty();
        myEx.replaceText();
        myEx.comparingStrings();
        myEx.concatStrings();
        myEx.containsSubstring();
        myEx.lengthOfTheString();
        myEx.removeSpaces();
        myEx.lowerCase();
        myEx.upperCase();
        myEx.substring();
    }

    private void lengthOfTheString() {
        String firstString = "My first string";
        // Length of the string
        System.out.println(firstString.length());
    }

    private void upperCase() {
        String firstString = "My first string";
        // Upper case
        System.out.println(firstString.toUpperCase());
    }

    private void lowerCase() {
        String firstString = "MY STRING";
        // Lower case
        System.out.println(firstString.toLowerCase());
    }

    private void blankOrEmpty() {
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

    private void replaceText() {
        // Replacing - case-sensitive
        String replaceText = "My bad idea is bad?";
        System.out.println(replaceText.replace("bad", "good"));
        System.out.println(replaceText.replace('?', '!'));
    }

    private void removeSpaces() {
        // Remove spaces
        // trim is older and does not support difference between languages
        String withSpace = "  my text  ";
        System.out.format("'%s'", withSpace.strip());
        System.out.format("'%s'", withSpace.stripLeading());
        System.out.format("'%s'", withSpace.stripTrailing());
        System.out.format("'%s'", withSpace.trim());
        String multiline = """
                    first line
                        second line
                third line
                """;
        System.out.format("'%s'", multiline.stripIndent());
    }

    private void workingWithChars() {
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

    private void comparingStrings() {
        // compareTo - returns negative int if first word before in alphabet
        // 0 - the same words
        // positive - if second word earlier alphabetically
        String fruit = "apple";
        String vegetable = "broccoli";

        System.out.println(fruit.compareTo(vegetable)); // -1
        System.out.println(fruit.compareToIgnoreCase(vegetable)); // non-case-sensitive
    }

    private void containsSubstring() {
        // Contains
        String containsMe = "Can anyone hear me?";
        System.out.println(containsMe.contains("me")); // true
    }

    private void concatStrings() {
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

        // Format in output
        System.out.format("%s %s\n", concatFirst, concatSecond);

        // String literals
        String finalLiteral = String.format("%s %s", concatFirst, concatSecond);
        System.out.println(finalLiteral);
    }

    private void substring() {
        String str = "apple";

        String firstLetter = str.substring(0, 1); // "a"
        String restPart = str.substring(1); // "pple"

        System.out.println(firstLetter.toUpperCase().concat(restPart));
    }
}
