package com.company;

public class InPlaceSorts {


    // goes through the list, swaps while # is bigger than the next.
    public static void insertionSort(int[] list1){
        int temp;
        int i = 1;
        int b = 0; //next starting int
        while (b < list1.length-1){
            while (i < list1.length){
                if (list1[b] > list1[i]){
                    temp = list1[b];
                    list1[b] = list1[i];
                    list1[i] = temp;
                }
                i++;
            }
            b++;
            i = b+1;
        }
    }
}
