package org.example;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String input = scanner.nextLine();
        String unique = "";
        int length = input.length();
        for(int i=0;i < length;i++)
        {
            char ch = input.charAt(i);
            if(unique.indexOf(ch) == -1){
                unique+=ch;
            }
        }
        System.out.println("Unique characters are:" + unique);
    }
}
