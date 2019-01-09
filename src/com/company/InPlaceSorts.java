package com.company;

public class InPlaceSorts {

    public static void insertionSort1(int[] list1){
        // i goes through list once
        // a goes through list several times and resets to find place to insert i
        int b = 0; // b is index of where it will be inserted
        for (int i = 0; i < list1.length ; i++ ){
            for (int a = i+1; a < list1.length; a++ ){
                if (list1[a] < list1[i]){
                    b = a;
                    //fix this
                }
            }
            //updates the entire array. insert i into the array and update the rest
            list1[i]
        }
    }

    // goes through the list, swaps while # is bigger than the next. resets at next starting int if it doesnt swap

    //needs fixing!!!!!
    public static void insertionSort(int[] list1){
        int temp;
        int i = 1;
        int b = 0; //next starting int
        while (b < list1.length){
            while (i < list1.length){
                if (list1[i-1] > list1[i]){
                    temp = list1[i-1];
                    list1[i-1] = list1[i];
                    list1[i] = temp;
                    i++;
                }
            }
            i = b;
            b++;
        }
    }
}
