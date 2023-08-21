package org.example.arrays;

//Problem: Given an array of integers, find the maximum and minimum values in the array.
public class ArrayUtils {

    public static int[] findMaxMin(int[] arr){
       if(arr == null || arr.length == 0){
           return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
       }

       int minVal = arr[0];
       int maxVal = arr[0];

       for(int num : arr){
           if(num > maxVal) maxVal = num;
           if(num < minVal) minVal = num;
       }

       return new int[]{maxVal, minVal};


    }

}
