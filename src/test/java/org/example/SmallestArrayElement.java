package org.example;

public class SmallestArrayElement {
    public static void main(String[] args){
        int[] array = {11,3,5,7,2,91,7,4,3};
        int min = array[0];
        for(int i =0; i < array.length;i++){
            if(array[i]< min){
                min =array[i];
            }
        }
        System.out.println(min);
    }
}
