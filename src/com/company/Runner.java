package com.company;

public class Runner {

    public static void main(String[] args) {

        //remember to put in timer and both checks

        System.out.println("Creating Random Int Array...");
        int[] testArr1 =  InPlaceSorts.randomIntArr(7);
        int[] sortedArr1 = InPlaceSorts.copyIntArray(testArr1);
        long timeStart = 0;
        long timeStop = 0;

        System.out.println("Sorting using insertionSort");
        timeStart = System.nanoTime();
        InPlaceSorts.insertionSort(sortedArr1);
        timeStop = System.nanoTime()-timeStart;

        System.out.println("Time for insertionSort: "+timeStop+" nanoseconds");

        //Print it out after you sort
        System.out.print("Before: ");
        for (int num:testArr1)
            System.out.print(num+" ");
        System.out.println();

        System.out.print("After: ");
        for (int num:sortedArr1)
            System.out.print(num+" ");
        System.out.println();



        System.out.println();
        System.out.println("Creating Random Double Array...");
        double[] testArr2 =  InPlaceSorts.randomDoubleArr(7);
        double[] sortedArr2 = InPlaceSorts.copyDoubleArray(testArr2);
        timeStart = 0;
        timeStop = 0;

        System.out.println("Sorting using selectionSort");
        timeStart = System.nanoTime();
        InPlaceSorts.selectionSort(sortedArr2);
        timeStop = System.nanoTime()-timeStart;

        System.out.println("Time for selectionSort: "+timeStop+" nanoseconds");

        //Print it out after you sort
        System.out.print("Before: ");
        for (double num:testArr2)
            System.out.print(num+" ");
        System.out.println();

        System.out.print("After: ");
        for (double num:sortedArr2)
            System.out.print(num+" ");
        System.out.println();

        //waluigi just gotta fix bubble sort




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
