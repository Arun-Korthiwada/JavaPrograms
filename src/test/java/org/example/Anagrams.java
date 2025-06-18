package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean anagram=true;
        System.out.println("Enter first string:");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String s2 = scanner.nextLine();
        String s1_Updated = s1.replaceAll("[^a-zA-Z]","").toLowerCase();
        String s2_Updated = s2.replaceAll("[^a-zA-Z]","").toLowerCase();
        if(s1_Updated.length() != s2_Updated.length()){
            anagram=false;
        }else{
            char[] s1_sort = s1_Updated.toCharArray();
            Arrays.sort(s1_sort);
            char[] s2_sort = s2_Updated.toCharArray();
            Arrays.sort(s2_sort);
            for (int i=0;i<s1_sort.length;i++){
                if(s1_sort[i] != s2_sort[i]){
                    anagram = false;
                }
            }
        }
        if(anagram) System.out.println("Entered Strings are anagram");
        else System.out.println("Entered Strings are not anagram");
    }
}
