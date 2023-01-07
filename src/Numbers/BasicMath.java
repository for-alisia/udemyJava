package Numbers;

public class BasicMath {
    public static void main(String[] args) {
        System.out.println(3 + 5 - 2 - 8 + 1); // -1
        System.out.println(2 * 3 * 4); // 24
        System.out.println(7 / 4); // 1
        // as 7 and 4 are int, the result will be an int too, it's not rounded, fractional part are just thrown away
        // Fix for it: - Java always will choose the type with more precision
        System.out.println(7f / 4); // 1,75
        // Or casting:
        System.out.println((double) 7 / 4); // 1.75
        // Modulo - returns a reminder (5 % 2 -> 2 * 2 + 1)
        System.out.println(5 % 2); // 1
        int x = 0;
        x+=1;
        System.out.println(x++);// post increment - will execute right after the statement - 1
        System.out.println(++x); // pre-increment - will execute right before - 3
        x--;
        System.out.println(--x); // 1
    }
}
