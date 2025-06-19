package org.example;

public class LargestArrayElement {
    public static void main(String[] args){
        int[] array = {1,3,5,7,2,91,7,4,3};
        int max = array[0];
        for(int i =0; i < array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
