package com.epam;

import java.util.ArrayList;
import java.util.HashSet;

public class StringsComparator {
    private static HashSet<String> duplicates;

    public static void setDuplicates() {
        duplicates = new HashSet<>();
    }

    public static boolean checkAndOutDuplicates(ArrayList<String> listStrings) {
        setDuplicates();
        boolean flag = arrayHasDuplicates(listStrings);
        outDuplicates();

        return flag;
    }

    private static boolean arrayHasDuplicates(ArrayList<String> listStrings) {
        HashSet<String> firstOccurrences = new HashSet<>();

        for (var currentString : listStrings) {
            if (!firstOccurrences.contains(currentString))
                firstOccurrences.add(currentString);
            else
                duplicates.add(currentString);
        }

        return duplicates.size() == 0;
    }

    private static void outDuplicates() {
        if (duplicates.size() > 0) {
            System.out.println("Equal strings are:");
            for (var duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
}
