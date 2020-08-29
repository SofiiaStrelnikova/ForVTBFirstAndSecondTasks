package com.epam;

import java.util.ArrayList;
import java.util.HashSet;

public class StringDuplicatesSearcher {
    public static boolean checkAndOutDuplicates(ArrayList<String> listStrings) {
        HashSet<String> duplicates = findDuplicates(listStrings);
        outDuplicates(duplicates);

        return duplicates.size() == 0;
    }

    private static HashSet<String> findDuplicates(ArrayList<String> listStrings) {
        HashSet<String> firstOccurrences = new HashSet<>(), duplicates = new HashSet<>();

        for (var currentString : listStrings) {
            if (!firstOccurrences.contains(currentString))
                firstOccurrences.add(currentString);
            else
                duplicates.add(currentString);
        }

        return duplicates;
    }

    private static void outDuplicates(HashSet<String> duplicates) {
        if (duplicates.size() > 0) {
            System.out.println("Equal strings are:");
            for (var duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
}
