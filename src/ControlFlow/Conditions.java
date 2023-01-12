package ControlFlow;

import java.util.Random;

public class Conditions {
    public static void main(String[] args) {
        int rndNum = new Random().nextInt(3) + 1;

        // If-Else
        System.out.printf("Your generated number: %d%n", rndNum);

        if (rndNum == 3) {
            System.out.println("You got it!");
        } else if (rndNum == 2) {
            System.out.println("You are almost there!");
        } else {
            System.out.println("Sorry, try again!");
        }
    }
}
