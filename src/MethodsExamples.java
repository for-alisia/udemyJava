public class MethodsExamples {
    private String firstName = "John";
    private String lastName = "Doe";
    // Static (class) initializer - if static field needs complicated logic
    public static int[] nums;
    // It's just an anonymous method
    static {
        nums = new int[3];
        nums[0] = 1;
        nums[1] = 11;
        nums[2] = 111;
    }

    // The second way to do it (more preferable as more obvious):
    public static String[] words = initializeWords();

    public static String[] initializeWords() {
       String[] words = new String[2];
       words[0] = "Hello";
       words[1] = "World";

       return words;
    };

    // In Java we can not have orphan functions - all functions should belong to class
    // This way they become methods
    public void printFullName() {
        System.out.println(firstName + lastName);
    }
    public String getLastName() {
        return lastName;
    }
    public int getSum(int a, int b) {
        return a + b;
    }

    // varargs - for uncertain amount of args - varargs is an array under the hood
    public void getAllSomething(String... words) {
        // do something clever here
        System.out.println(words.length);
    }

    // Vararg param should be last argument
    public void doMixedVarargs(int num1, int num2, String... words) {
        // do something;
    }


    public static void main(String[] args) {
        MethodsExamples methodsExamples = new MethodsExamples();
        methodsExamples.printFullName();
        System.out.println(methodsExamples.getLastName());
        System.out.println(methodsExamples.getSum(1,5));
        methodsExamples.getAllSomething("one", "two", "three");
        methodsExamples.doMixedVarargs(1, 2, "my", "mixed", "args", "here");
    }
}
