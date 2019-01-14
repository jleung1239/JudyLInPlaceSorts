package com.company;

public class Runner {

    public static void main(String[] args) {

        //remember to put in timer and both checks

        System.out.println("Testing insertionSort for int arrays:");
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();

        InPlaceSorts.insertionSort(testArr);

        //Print it out after you sort
        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();



        System.out.println();
        System.out.println("Testing selectionSort for double arrays:");
        double[] test1 = {6.4,7.8,5.1,5.7,3.5,2,3.9};
        System.out.print("Before: ");
        for (double num:test1)
            System.out.print(num+" ");
        System.out.println();

        InPlaceSorts.selectionSort(test1);

        //Print it out after you sort
        System.out.print("After: ");
        for (double num:test1)
            System.out.print(num+" ");
        System.out.println();




        //test bubble sort
        System.out.println();
        System.out.println("Testing bubbleSort for String arrays:");
        String[] test2 = {"Bob","Rebecca","John","Lizzie","Rose","Rosanna","Anne","Ana","0Bobby"};
        System.out.print("Before: ");
        for (String num:test2)
            System.out.print(num+" ");
        System.out.println();

        InPlaceSorts.bubbleSort(test2);

        //Print it out after you sort
        System.out.print("After: ");
        for (String num:test2)
            System.out.print(num+" ");
        System.out.println();


    }
}
