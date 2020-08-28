package com.epam;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("To check if all of entries in ArrayList are different enter \"1\", " +
                    "to add two integers enter \"2\":");
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> lookForDuplicatesInArrayListOfStrings();
                case "2" -> addTwoIntegers();
                default -> System.out.println("Incorrect input! Please enter \"1\" or \"2\"!");
            }
        }
    }

    private static void lookForDuplicatesInArrayListOfStrings() {
        ArrayList<String> listStrings = new ArrayList<>();
        int sizeOfArray = Reader.readNaturalNumber();

        for (int i = 0; i < sizeOfArray; ++i) {
            System.out.print("Enter a string:");
            listStrings.add(scanner.nextLine());
        }

        if (StringsComparator.compareStringsInArray(listStrings))
            System.out.println("All of entries are different!");
    }

    private static void addTwoIntegers() {
        int a = Reader.readAnInteger(), b = Reader.readAnInteger();

        try {
            System.out.println("Result of adding is " + IntegersAdder.sum(a, b));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
