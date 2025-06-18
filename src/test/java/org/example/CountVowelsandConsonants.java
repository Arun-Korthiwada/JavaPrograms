package org.example;

import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args) {
        int ccount =0, vcount=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        String lowerinput = input.toLowerCase();
        int length = lowerinput.length();
        for (int i = 0; i < length; i++) {
            char c = lowerinput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vcount++;
            } else if (c >= 'a' && c <= 'z') {
                ccount++;
            }
        }
        System.out.println("Vowels count is" + vcount);
        System.out.println("Consonants count is" + ccount);
        scanner.close();
    }
}
