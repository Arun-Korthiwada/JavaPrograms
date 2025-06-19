package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static void main(String[] args){
        int[] array={1,2,4,3,2,1,8,9,5,1,8,6,9,9};
        Map<Integer,Integer> map= new HashMap<>(Collections.emptyMap());
        for(int num:array){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());

        }
    }
}
