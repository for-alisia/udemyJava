package Numbers;

public class NumericWrappers {
    public static void main(String[] args) {
        int num = 7;
        Integer numCl = Integer.valueOf(7); // Wrapper class for primitive
        Double dbl = Double.valueOf(23.12);
        Byte bt = Byte.valueOf("12");
        Float fl = Float.valueOf(23.65f);
        // Auto-boxing - Java wraps primitive in a wrapper class
        storeData(num);

        // Convert user's inputs
        int age = Integer.parseInt("23");
        System.out.println(age);

        double some = Double.parseDouble("23.456");
        System.out.println(some);

        boolean isFlag = Boolean.parseBoolean("true");
        System.out.println(isFlag);
    }

    /**
    * Take any input and stores it somewhere generally
    */
    public static void storeData(Object input) {
        // do smth with an object
    }
}
