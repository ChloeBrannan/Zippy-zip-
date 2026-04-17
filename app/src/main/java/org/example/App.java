package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int max = Math.max(size1, size2);

        for (int i = 0; i < max; i++) {
            if (i < size1) {
                result.add(list1.get(i));
            }
            if (i < size2) {
                result.add(list2.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> odds = java.util.Arrays.asList(1, 3, 5);
        List<Integer> evens = java.util.Arrays.asList(2, 4, 6);

        List<Integer> combined = zip(odds, evens);
        System.out.println(combined);
    }
}