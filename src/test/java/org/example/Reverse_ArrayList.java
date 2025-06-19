package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        ArrayList<Integer> arraylist = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original String:" + arraylist);
        Collections.reverse(arraylist);
        System.out.println("Reverse String:" + arraylist);

    }
}
