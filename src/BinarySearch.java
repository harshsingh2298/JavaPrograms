package org.example;

import java.util.Scanner;

public class BinarySearch {


    // for binary search first i have to take one sorted array
    // then declare three variable as first, last and mid and key as the element we are searching
    // first is 0 in start of the initialization and last is arr.length-1 and mid we declare inside the while loop
    // so then create a function as binary search where while loop will be there as condition as first<=last
    // it will be true till length then initialize mid as first + last / 2 ;
    // then if arr[mid]>key then last = mid-1;  if arr[mid]<key then first = mid -1; and mid == key answer
    public static int binarySearch(int[] arr, int last, int first, int key) {

        while (first <= last) {
            int  mid = ( first + last )/2;
            if (arr[mid] > key) {
                last = mid - 1;

            }
            if (arr[mid]<key){
                first = mid + 1;

            }
            if (arr[mid]==key){
                return mid;
            }
        }
return -1;
    }


    // this is the method for bubble sort in this is the easiest sort technics
    // first create one variable as temp as take one for loop till length-1
    // second take a inner for loop for the sorting the element and swaping
    // then in if block check condition if current element is bigger then next than swaping
    // temp = 1 st element then 2nd element = 1 element and temp = 1 element
    // sorting done

    public static int[] sortArray(int []arr){
        int temp ;                                //[9,2,4...]
        for (int i=0;i<arr.length-1;i++){

            for (int j=0; j< arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }


        }
        return arr;
    }
// in this insertion sorting we create a for loop to iterate through 1 element of array
    // then take key which is first element of array as sorted = arr[i]
    // then j as a array pointer of sorting = arr[i-1]
    //then check the condition in while loop as j>=0 && arr[j]>key
    // swap as arr[j+1]=arr[j]
    //and j-- for again shifting the pointer
    // outside the while keep arr[j+1]=key so the pointer will change to check next index

    public static int[] insertionSort(int[]arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

        public static void main (String[]args){

            int[] arr = {23,5,6,44,59,4,12,65,110,21,22};
            for (int x: arr
                 ) {
                System.out.println("Array present " + x);
            }

            int[] sortedArr = sortArray(arr);
            for (int x: sortedArr
            ) {
                System.out.println("Sorted Array is ="+x);
            }

            int[] insertionSort = insertionSort(arr);
            for (int y:insertionSort
                 ) {
                System.out.println("Data sorted through insertion sort ="+y);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Search value");
            int key = scanner.nextInt();



            int last = sortedArr.length-1;
            binarySearch(sortedArr, last,0, key);
            int result = binarySearch(sortedArr, last, 0, key);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
