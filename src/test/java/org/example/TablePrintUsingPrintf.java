package org.example;
import java.util.Scanner;

public class TablePrintUsingPrintf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        for(int i=1;i <= 10;i++){
            System.out.printf(num + " * " + i + " = " + num*i);
            System.out.print("\n");

        }
    }
}
