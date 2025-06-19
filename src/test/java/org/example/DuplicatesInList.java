package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.in;

public class DuplicatesInList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,3,4,5,1,8,9));
        List<Integer> Unique = new ArrayList<>(Collections.emptyList());
        for(int n : list){
            if(!Unique.contains(n)){
                Unique.add(n);
            }
        }
        Collections.sort(list);
        System.out.println("list"+ list);
        System.out.println("Unique"+ Unique);

    }
}
