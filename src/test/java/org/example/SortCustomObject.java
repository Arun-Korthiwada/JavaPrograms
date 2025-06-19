package org.example;

import java.util.*;

public class SortCustomObject {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(Arrays.asList(
                new Person("Arun Kumar", 30),
                new Person("Zridevi Patha",27),
                new Person("Viyaan Korthiwada",1)
     ));
//        System.out.println("Original List"+ person);
        for(Person p:person){
            System.out.println(p.getname()+" "+p.getage());
        }
        Collections.sort(person, Comparator.comparingInt(Person::getage));
        System.out.println("Sorted List"+ person);
        for(Person p:person){
            System.out.println(p.getname()+" "+p.getage());
        }

    }

   static class Person {
        private String name;
        private int age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getname() {
            return name;
        }

        public int getage() {
            return age;
        }
    }
}
