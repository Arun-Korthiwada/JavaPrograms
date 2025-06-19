package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeUnsortedList {
    public static void main(String[] args){
       List<Integer> list1 = Arrays.asList(5,3,1);
        List<Integer> list2 = Arrays.asList(6,4,2);
        List<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        Collections.sort(result,Collections.reverseOrder());
        System.out.println(list1 + " "+list2 + " " +result);
    }
}
