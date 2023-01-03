package Strings;

public class Start_EndsWith {
    public static void main(String[] args) {
        String myFile = "myfile.txt";
        // methods return true/false
        // spaces matter
        System.out.println(myFile.endsWith(".txt")); // true
        System.out.println(myFile.startsWith("my")); // true
    }
}
