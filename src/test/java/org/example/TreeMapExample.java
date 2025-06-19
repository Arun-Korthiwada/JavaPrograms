package org.example;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args)
    {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(102,"Alice");
        treeMap.put(101,"BOB");
        treeMap.put(103,"Riverside");
        System.out.println(treeMap);
        treeMap.remove(101);
        treeMap.put(534,"Arun Kumar");
        System.out.println(treeMap);
    }
}
