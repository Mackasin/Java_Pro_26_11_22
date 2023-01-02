package com.hillel.dzhurynskyi.homework.hm9.task1;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        Integer[] integers = {1656, 162, 16, 56, 545, 656, 56, 5, 526, 56, 5, 564, 6, 5, 6};
        List<String> listStr = new ArrayList<>(Arrays.asList("lll", "sss", "sss", "kkk", "kkk", "iui", "sss", "lll"));
        System.out.println(countOccurrence(listStr, "sss"));
        System.out.println(toList(integers));
        System.out.println(findUnique(toList(integers)));
        calcOccurrence(listStr);
        System.out.println(findOccurrence(listStr));
    }

    public static int countOccurrence(List<String> listStr, String stringCount) {
        int counter = 0;
        for (String el : listStr) {
            if (el.equals(stringCount)) counter++;
        }
        return counter;
    }

    public static List<Integer> toList(Integer[] integers) {
        return new ArrayList<>(Arrays.asList(integers));
    }

    public static List<Integer> findUnique(List<Integer> integers) {
        return new ArrayList<>(new HashSet<>(integers));
    }

    public static void calcOccurrence(List<String> listStr) {
        Map<String, Integer> map = new HashMap<>();
        for (String el : listStr) {
            map.putIfAbsent(el, 0);
            map.put(el, map.get(el) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);

        }
    }

    public static List<WordCounter> findOccurrence(List<String> listStr) {
        Map<String, Integer> map = new HashMap<>();
        for (String el : listStr) {
            map.putIfAbsent(el, 0);
            map.put(el, map.get(el) + 1);
        }

        List<WordCounter> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(new WordCounter(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}
