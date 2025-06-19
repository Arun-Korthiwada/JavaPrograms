package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElementList {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,2,5,3,5,5,1,2,5,1,5,4,3);
        int length = list.size();
        HashMap<Integer,Integer> frequencycounter = new HashMap<>();
        for(int n: list)
        {
            frequencycounter.put(n,frequencycounter.getOrDefault(n,0)+1);
        }
        int frequentCounter = -1;
        int maxCount =0;
        for(Map.Entry<Integer, Integer> entry: frequencycounter.entrySet()){
            if(entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                frequentCounter = entry.getKey();
            }

        }
        System.out.println("Frequent number: "+ frequentCounter);
        System.out.println("maxCount: "+ maxCount);

    }
}
