package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionOfLists {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,4,3,2,5,9,99);
        List<Integer> list2 = Arrays.asList(1,5,8,1,4,3,2,5,99);
        System.out.println(intersectionLists(list1,list2));

    }
    public static List<Integer> intersectionLists(List<Integer> l1,List<Integer> l2){
        List<Integer> intersection = new ArrayList<>();
        for(int i: l1){
            if(l2.contains(i)){
                intersection.add(i);
            }
        }
        return intersection;
    }
}
