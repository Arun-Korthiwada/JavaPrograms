package org.example;



import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
    }
}
