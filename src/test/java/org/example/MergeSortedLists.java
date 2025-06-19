package org.example;

import java.util.*;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

        List<Integer> merged = mergeSorted(list1, list2);
        System.out.println("Merged List: " + merged);
    }

    public static List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        // Merge while both have elements
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < list1.size()) {
            result.add(list1.get(i++));
        }
//
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }
}
