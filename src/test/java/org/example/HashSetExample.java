package org.example;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("xyz");
        hashSet.add("abc");
        hashSet.add("ghi");
        System.out.println("Before removal"+ hashSet);
        hashSet.remove("Kerala");
        hashSet.remove("abc");
        System.out.println("After removal"+ hashSet);

    }
}
