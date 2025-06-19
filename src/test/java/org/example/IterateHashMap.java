package org.example;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>(Map.of(
                101,"Bob",102,"Andy",103,"Judy"
        ));
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
