package Strings;

public class ReplaceText {
    public static void main(String[] args) {
        // Replacing - case-sensitive
        String replaceText = "My bad idea is bad?";
        System.out.println(replaceText.replace("bad", "good"));
        System.out.println(replaceText.replace('?', '!'));
    }
}
