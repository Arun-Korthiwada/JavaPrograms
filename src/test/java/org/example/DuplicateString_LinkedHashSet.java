package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateString_LinkedHashSet {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        for(int i =0;i < input.length();i++)
        {
            unique.add(String.valueOf(input.charAt(i)));
        }
        for(String item : unique)
        {
            System.out.print(item);
        }
        scanner.close();
    }
}
