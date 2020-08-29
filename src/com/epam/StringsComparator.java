package com.epam;

import java.util.ArrayList;
import java.util.HashSet;

public class StringsComparator {
    public static boolean compareStringsInArray(ArrayList<String> listStrings) {
        HashSet<String> firstOccurrences = new HashSet<>(), duplicates = new HashSet<>();

        for (var currentString : listStrings) {
            if (!firstOccurrences.contains(currentString))
                firstOccurrences.add(currentString);
            else
                duplicates.add(currentString);
        }

        if (duplicates.size() > 0) {
            System.out.println("Equal strings are:");
            for (var duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }

        return duplicates.size() == 0;
    }
}
