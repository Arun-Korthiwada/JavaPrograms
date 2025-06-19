package org.example;

import java.util.*;

public class ListToSet {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,2,2,7));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(list + " " +set);

    }
}
