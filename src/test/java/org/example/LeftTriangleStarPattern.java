package org.example;

import java.awt.*;
import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        for(int i = n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
