package org.example;

import java.util.*;

public class DuplicateElementsArray {
    public static void main(String[] args){
        int[] num = {1,2,5,3,1,9,7,2,4,5};
//        int[] dup = new int[0];
        Set<Integer> dup = new HashSet<>();
        for(int i=0;i< num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] == num[j]) {
                    dup.add(num[i]);
                }
            }
        }
        System.out.print(dup);
    }
}
