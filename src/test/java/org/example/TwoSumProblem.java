package org.example;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args){
        int[] num ={2,4,5,6};
        int sum =10;
        for(int i=0;i< num.length;i++)
        {
            for(int j = i+1 ; j < num.length;j++)
            {
                if (num[i]+num[j] == sum){
                    System.out.println( );

                }
            }
        }
    }
}
