package org.example.arrays;

public class MaxMinFinder {
    public static void main(String[] args){
        int[] array = {4,6,3,7,9};
        int[] result = ArrayUtils.findMaxMin(array);

        int maxVal = result[0];
        int minVal = result[1];
        System.out.println("Max value of an Array is: "+maxVal);
        System.out.println("Min value of an Array is: "+minVal);

    }
}
