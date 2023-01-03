package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
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
}
