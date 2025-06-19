package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer,String> hashmap= new HashMap<>();
        hashmap.put(1,"Arun");
        hashmap.put(2,"Kumar");
        hashmap.put(3,"Korthiwada");
        System.out.println("Before removal" + hashmap);
        hashmap.remove(2);
        hashmap.put(34,"Arun Kumar Korthiwada");
        hashmap.put(45,"Akhil");
        System.out.println("After Inundation" + hashmap);
        for(int k : hashmap.keySet()){
            System.out.println(hashmap.get(k));
        }
        for(Map.Entry<Integer,String> entry: hashmap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());

    }
}
