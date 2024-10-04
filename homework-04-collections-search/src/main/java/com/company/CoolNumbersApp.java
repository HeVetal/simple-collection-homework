package com.company;

import java.util.*;

import static com.company.Constants.*;

public class CoolNumbersApp {

    private List<String> list = CoolNumbers.generateCoolNumbers();
    private String coolNumber = "В444ХХ103";

    public void timeBruteForceSearchInList() {
        long startTime = System.nanoTime();
        boolean isFind = CoolNumbers.bruteForceSearchInList(list, coolNumber);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Поиск перебором: номер %s, поиск занял %dнс", isFind ? "найден" : "не найден", timeElapsed);
        System.out.println(System.lineSeparator());
    }

    public void timeBinarySearchInList() {
        Collections.sort(list);
        long startTime = System.nanoTime();
        boolean isFind = CoolNumbers.binarySearchInList(list, coolNumber);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Бинарный поиск: номер %s, поиск занял %dнс", isFind ? "найден" : "не найден", timeElapsed);
        System.out.println(System.lineSeparator());
    }

    public void timeSearchInHashSet() {
        HashSet<String> set = new HashSet<>(list);
        long startTime = System.nanoTime();
        boolean isFind = CoolNumbers.searchInHashSet(set, coolNumber);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.printf("Поиск в HashSet: номер %s, поиск занял %dнс", isFind ? "найден" : "не найден", timeElapsed);
        System.out.println(System.lineSeparator());
    }

    public void searchInTreeSet(){


    }
}
