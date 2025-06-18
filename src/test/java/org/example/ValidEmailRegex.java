package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailRegex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email Id");
        String email = scanner.nextLine();
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(email);
        if(email.matches(regex)) System.out.println("Valid format");
        else System.out.println("Invalid format");
        if(match.matches()) System.out.println("Valid format");
        else System.out.println("Invalid format");

    }
}
