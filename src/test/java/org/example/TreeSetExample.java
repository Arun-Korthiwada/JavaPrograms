package org.example;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args)
    {
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("zabc");
        treeset.add("def");
        treeset.add("ijgf");
        System.out.println("Before removal"+ treeset);
        treeset.remove("def");
        System.out.println("After removal"+ treeset);
        Iterator<String> iterator = treeset.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
