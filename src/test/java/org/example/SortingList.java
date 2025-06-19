package org.example;

import java.util.*;

public class SortingList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,4));
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list );

    }
}
