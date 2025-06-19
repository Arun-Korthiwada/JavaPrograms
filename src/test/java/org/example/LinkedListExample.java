package org.example;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Assam");
        linkedlist.add("Uttar Pradesh");
        linkedlist.add("Kerala");
        System.out.println("Before removal"+ linkedlist);
        linkedlist.remove("Kerala");
        linkedlist.remove(1);
        System.out.println("After removal"+ linkedlist);

    }
}
