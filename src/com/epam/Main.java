package com.epam;

import java.util.*;

public class Main {
    public static Reader reader = new Reader();

    public static void main(String[] args) {
        while (true) {
            System.out.print("To check if all of entries in ArrayList are different enter \"1\", " +
                    "to add two integers enter \"2\":");
            String input = reader.getScanner().nextLine();

            switch (input) {
                case "1" -> lookForDuplicatesInArrayListOfStrings();
                case "2" -> addTwoIntegers();
                default -> System.out.println("Incorrect input! Please enter \"1\" or \"2\"!");
            }
        }
    }

    private static void lookForDuplicatesInArrayListOfStrings() {
        ArrayList<String> listStrings = new ArrayList<>();
        int sizeOfArray = reader.readNaturalNumber();

        for (int i = 0; i < sizeOfArray; ++i) {
            System.out.print("Enter a string:");
            listStrings.add(reader.getScanner().nextLine());
        }

        if (StringsComparator.checkAndOutDuplicates(listStrings))
            System.out.println("All of entries are different!");
    }

    private static void addTwoIntegers() {
        int a = reader.readAnInteger(), b = reader.readAnInteger();

        try {
            System.out.println("Result of adding is " + IntegersAdder.sum(a, b));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
