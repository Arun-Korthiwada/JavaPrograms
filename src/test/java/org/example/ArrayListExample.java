package org.example;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
       ArrayList<String> arraylist= new ArrayList<>();
       arraylist.add("Telangana");
       arraylist.add("Andhra Pradesh");
       arraylist.add("Bihar");
        System.out.println("Before removal"+ arraylist);
        arraylist.remove("Bihar");
        arraylist.remove(1);
        System.out.println("After removal"+ arraylist);


    }
}
