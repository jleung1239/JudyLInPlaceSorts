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

    //second attempt
    public static void insertionSort2(int[] list1){
        //move the smallest int to the front, check it backwards following the (new) one that got swapped.
        // it checks backwards until it stops swapping. then it swaps the forward one again
        int temp;
        int swap;
        int i = 1; //next starting int
        int b; //keeps track of the swapped one
        while (i < list1.length){
            if (list1[i] < list1[i-1]){
                temp = list1[i-1];
                list1[i-1] = list1[i];
                list1[i] = temp;
                b = i-1;
                if (b > 0){
                    swap = 1; // fix this, it will loop forever rn
                    while ( swap > 0 ){
                        if (list1[b] < list1[b-1] ){
                            temp = list1[b];
                            list1[b] = list1[b-1];
                            list1[b-1] = temp;
                            b--;
                        }
                        else
                        {
                            swap = 0;
                        }
                    }
                }
            }
            i++;
        }

    }


    public static void selectionSort(double[] list1){
        int i; //goes through the whole list
        int x = 0; //keeps track of the next smallest int
        int y = 0; //keeps track of where to start next
        double temp; //used to swap
        while (y < list1.length - 1){
            for (i = y ; i < list1.length; i++){
                if (list1[x] > list1[i]){
                    x = i;
                }
            }
            temp = list1[y];
            list1[y] = list1[x];
            list1[x] = temp;
            y++;
            x = y;

        }
    }
}
