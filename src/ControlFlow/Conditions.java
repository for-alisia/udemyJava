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

        // Reversed logic for strings - as null doesn't have any methods on it
        String command = null; // Let's pretend it's an input from somewhere

        // If we use command.equals("") the app would crash if command is null
        if ("go".equals(command)) {
            System.out.println("I'm going...");
        } else if ("stop".equals(command)) {
            System.out.println("I'm stopping...");
        }

        // Switch
        // Also doesn't work with null (before Java 17)
        switch (rndNum) {
            case 1:
                System.out.println("You got 1!");
                break;
            case 2:
                System.out.println("You got 2!");
                break;
            case 3:
                System.out.println("You got 3!");
                break;
            default:
                System.out.println("No idea what you got :(");
        }

        // Enhanced Switch - available from Java 14
        String card = "ace";
        int currentTotal = 13;

        int currentValue = switch(card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if (currentTotal < 11) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);
        };

        System.out.println(currentValue + currentTotal);

        // Switch with pattern matching - available from Java 17 in experimental mode
        // Supports null
        String srt = "Hi there";
        String[] arr = { "hi", "there" };

        Object obj = arr;

        switch(obj) {
            case String msg -> System.out.println("It's a string " + msg);
            case String[] sarr -> System.out.printf("It's an array of %d elements%n", sarr.length);
            case null, default -> System.out.println("No idea what is it");
        }
    }
}
