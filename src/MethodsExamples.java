public class MethodsExamples {
    // In Java all classes that do not extend some class explicitly, extend built-in class Object
    private String firstName;
    private String lastName;
    public static int[] nums;
    // Static (class) initializer - if static field needs complicated logic
    // It's just an anonymous method to prepare class
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

    // Constructors
    // No-args constructor
    // If no constructors are provided, Java will create no-arg constructor by default
    // Some frameworks relay on non-arg constructor, so if there is arg-constructor,
    // no-arg should be added manually, but it does not mandatory to be public
    // just make it private not to be accessible from outside
    private MethodsExamples() {}

    // With args constructor
    public MethodsExamples(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    // Getters and Setters
    // Fields generally should be private without no access from outside
    // Press Cmd(Alt) + N to generate getters and setters

    public String getFirstName() {
        return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
    }

    // To show context menu and create method to Override - ctrl + O in IntelliJ
    @Override
    public String toString() {
        System.out.println("We can override existing parent method or call it after with super");
        return super.toString();
    }

    // Visibility - the same rules apply to the class fields as well
    public void publicMethod() {
        System.out.println("Accessible from everywhere");
    }

    private void privateMethod() {
        System.out.println("Accessible for kids everywhere and within package");
    }

    void packageProtectedMethod() {
        System.out.println("Accessible within package");
    }
}
