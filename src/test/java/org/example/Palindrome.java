package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase to verify whether it is palindrome or not");
        String input = scanner.nextLine();
        String reverse = "";
        int length = input.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse+=input.charAt(i);
        }
        System.out.println(length + input + " "+ reverse);

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("Provided text is a palindrome");
        } else System.out.println("Provided text is not a palindrome");
        scanner.close();

    }
}
