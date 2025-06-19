package org.example;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Bihar");
        linkedHashSet.add("Assam");
        linkedHashSet.add("Goa");
        System.out.println("Before removal"+ linkedHashSet);
        linkedHashSet.remove("Goa");
        System.out.println("After removal"+ linkedHashSet);
        Iterator<String> s = linkedHashSet.iterator();
        while (s.hasNext())
        {
            System.out.println(s.next());
        }
    }
}
