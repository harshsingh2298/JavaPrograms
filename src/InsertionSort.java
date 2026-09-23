package org.example;

// Insertion sort in Java


import java.util.Arrays;

class InsertionSort {

    void insertionSort(int array[]) {
        // declare a for loop which starts from the 1 index
        // then declare variable key and j
        // key = current index of array where j = current index - 1
        // then declare a while loop and check the condition as j=> 0 && arr[j]>key
        // then

        for (int i=1;i< array.length;i++){
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j]>key){
                array[j+1] = array[j];
                j=j-1;
            }
            array[j+1]=key;
        }

    }

    // Driver code
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        InsertionSort is = new InsertionSort();
        is.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
