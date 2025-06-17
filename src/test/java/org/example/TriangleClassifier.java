package org.example;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Side 1 length");
        int side1 = scanner.nextInt();
        System.out.println("Enter Side 2 length");
        int side2 = scanner.nextInt();
        System.out.println("Enter Side 3 length");
        int side3 = scanner.nextInt();
        if(side1 == side2 && side2 == side3) System.out.println("Equilateral Triangle");
        else if (side1 == side2 || side2 == side3 || side3 == side1) System.out.println("isosceles Triangle");
        else System.out.println("Scalene Triangle");
    }
}
