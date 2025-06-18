package org.example;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean prime=true;
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if(num <=1){
            prime=false;
        } else {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }


        }
        if(prime) System.out.println(num + " is a prime number");
        else System.out.println(num + " is not a prime number");
    }
}
