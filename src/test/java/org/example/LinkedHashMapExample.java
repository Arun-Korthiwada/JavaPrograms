package org.example;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101,"BOB");
        linkedHashMap.put(102,"Alice");
        linkedHashMap.put(103,"Riverside");
        System.out.println(linkedHashMap);
        linkedHashMap.remove(101);
        linkedHashMap.put(534,"Arun Kumar");
        System.out.println(linkedHashMap);
        for(int k : linkedHashMap.keySet())
        {
            System.out.println(k + " " +linkedHashMap.get(k));
        }
        for(Map.Entry<Integer,String> map: linkedHashMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());

        }

    }
}
