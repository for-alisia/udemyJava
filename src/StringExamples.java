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

        // Replacing - case-sensitive
        String replaceText = "My bad idea is bad?";
        System.out.println(replaceText.replace("bad", "good"));
        System.out.println(replaceText.replace('?', '!'));

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

        // charAt
        String apple = "apple";
        int length = apple.length();
        if (length > 100) {
            System.out.println(apple.charAt(100)); // throws an exception as index is out of boundaries
        }
        System.out.println(apple.charAt(3));

        // compareTo - returns negative int if first word before in alphabet
        // 0 - the same words
        // positive - if second word earlier alphabetically
        String fruit = "apple";
        String vegetable = "broccoli";

        System.out.println(fruit.compareTo(vegetable)); // -1
        System.out.println(fruit.compareToIgnoreCase(vegetable)); // non-case-sensitive

        // Contains
        String containsMe = "Can anyone hear me?";
        System.out.println(containsMe.contains("me")); // true
    }
}
