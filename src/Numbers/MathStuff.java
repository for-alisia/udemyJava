package Numbers;

import java.security.SecureRandom;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {
        // Constants
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // Absolute:
        System.out.println(Math.abs(-3));
        // Round up:
        System.out.println("Round up with Math.ceil()");
        System.out.println(Math.ceil(2.00)); // 2
        System.out.println(Math.ceil(2.45)); // 3
        System.out.println(Math.ceil(2.55)); // 3
        // Round down:
        System.out.println("Round down with Math.floor()");
        System.out.println(Math.floor(3.00)); // 3
        System.out.println(Math.floor(2.5)); // 2
        System.out.println(Math.floor(2.95)); // 2
        // Round:
        System.out.println("Round with Math.round()");
        System.out.println(Math.round(3.00)); // 3
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.round(2.00)); // 2
        // Max/Min
        System.out.println("Max and Min");
        System.out.println(Math.min(5, 2)); // 2
        System.out.println(Math.max(5, 2)); // 5
        // Power:
        System.out.println("Power");
        System.out.println(Math.pow(3, 3)); // Returns double - 27.0
        // Square root
        System.out.println("Square root");
        System.out.println(Math.sqrt(81)); // 9.0 (Returns double)
        // Random:
        System.out.println("Random");
        System.out.println(Math.random());
        // To get a number in range from 1 to 10
        System.out.println((int)(Math.random() * 10) + 1);
        // With Random class
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10)); // random up to 10
        SecureRandom secRnd = new SecureRandom();
        System.out.println(secRnd.nextInt(10));
    }
}
