package com.company;

public class InPlaceSorts {

    // goes through the list, swaps while # is bigger than the next.
    // this is based on how sorting a hand of cards is like, but it is unfinished and discontinued
    public static void insertionSort0(int[] list1){
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

    //second attempt, based off the dance video
    public static void insertionSort(int[] list1){
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
                    swap = 1; // you might need to fix this to condense some code
                    while ( swap > 0 && b > 0){
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



    // sort in 0-10, alphabetical order?
    // i have no idea how special characters are going to be sorted so i guess their value will be 1 so itll sort from smallest to most special charas
    public static void bubbleSort(String[] arr){
        int swap = 1;
        String temp;
        while (swap > 0){
            swap = 0;
            for (int i = 1; i < arr.length; i++){
                if ((arr[i-1].compareTo(arr[i])) > 0){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swap++;
                }
            }
        }

    }


    //check if arr is sorted from least to greatest
    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }


    //checks if the sum of arrays are the same before and after being sorted
    public static boolean checkSum(int[] before, int[] after){
        int i;
        int beforeSum = 0;
        int afterSum = 0;
        for (i = 0; i < before.length; i++){
            beforeSum += before[i];
        }
        for (i=0; i < after.length; i++){
            afterSum += after[i];
        }
        if (beforeSum == afterSum){
            return true;
        }
        else
        {
            return false;
        }
    }


    // creates array of random integers from 0 to 1000
    // count = length of array
    public static int[] randomIntArr(int count){
        int arr[] = new int[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 1001);
        }
        return arr;
    }

    public static int[] copyIntArray(int[] arr){
        int copy[] = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    public static double[] randomDoubleArr(int count){
        double arr[] = new double[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.round((Math.random() * 1001)*100);
            arr[i] = arr[i]/100;
        }
        return arr;
    }

    public static double[] copyDoubleArray(double[] arr){
        double copy[] = new double[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }
}
