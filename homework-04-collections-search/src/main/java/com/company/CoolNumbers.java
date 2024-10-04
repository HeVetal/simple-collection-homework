package com.company;

import java.util.*;

import static com.company.Constants.PATTERN;

public class CoolNumbers {
    private static String letters = "АВЕКМНОРСТУХ";

    public static List<String> generateCoolNumbers() {
        List<String> listCoolNumbers = new ArrayList<>();
        for (int i = 0; i < 2000001; i++) {
            String coolNumber = generateCoolNumber();
            if (!generateCoolNumber().contains(coolNumber)) {
                listCoolNumbers.add(coolNumber);
            }
        }
        return listCoolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (String string : list) {
            if (string.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        if (Collections.binarySearch(sortedList, number) > 0) {
            return true;
        }
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long startTime = System.nanoTime();
        boolean isFound = treeSet.contains(number);
        long endTime = System.nanoTime();
        System.out.printf(PATTERN, "в TreeSet", number, isFound ? "" : "не", endTime - startTime);
        return isFound;
    }



    private static int randomNumber(int number) {
        return (int) (Math.random() * number) + 1;
    }

    private static String generaNumber() {
        int i = randomNumber(9);
        String number = "" + i + i + i;
        return number;
    }

    private static String generateRegion() {
        int i = randomNumber(199);
        if (i < 10) {
            return "0" + i;
        }
        return "" + i;
    }

    private static String generateLetter() {
        char c = letters.charAt(randomNumber(letters.length() - 1));
        return String.valueOf(c);
    }

    private static String generateCoolNumber() {
        return generateLetter() + generaNumber() +
                generateLetter() + generateLetter() + generateRegion();
    }
}
