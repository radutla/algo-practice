package com.algo.practice;

public class FindSmallestBiggestInArray {

    public static void printSmallAndBiggest(int[] arrayNums) {
        int smallest = arrayNums[0];
        int biggest = arrayNums[0];

        for (int i = 1; i < arrayNums.length; i++) {
            if (arrayNums[i] < smallest) {
                smallest = arrayNums[i];
            } else if (arrayNums[i] > biggest) {
                biggest = arrayNums[i];
            }
        }
        System.out.println("Smallest number is - " + smallest);
        System.out.println("Biggest number is - " + biggest);
    }


    public static void main(String[] args) {

        int[] arrayNums = {1, 1, -1, 1, 1};
        printSmallAndBiggest(arrayNums);
    }
}


