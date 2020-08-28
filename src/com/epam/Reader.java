package com.epam;

import java.util.Scanner;

public class Reader {
    public static Scanner scanner = new Scanner(System.in);

    public static int readAnInteger() {
        int a;

        while (true) {
            System.out.print("Please enter integer:");
            try {
                a = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("This is not an integer!");
            }
        }

        return a;
    }

    public static int readNaturalNumber() {
        int a;

        while (true) {
            System.out.println("Please, enter a positive integer:");
            try {
                a = Integer.parseInt(scanner.nextLine());
                if (a < 1) {
                    System.out.println("This is not a POSITIVE integer!");
                } else {
                    break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("This is not an integer!");
            }
        }

        return a;
    }
}
