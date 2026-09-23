package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArray {

    public static  Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter Number of counts");
        int count = scanner.nextInt();
       int arr[] = readingArray(count);
      int min =  minValue(arr);
        System.out.println("Min value in array is  " +min);
//        for (int x: arr) {
//            System.out.print(x);
//        }

        int max = maxValue(arr);
        System.out.println("Max value in array is  "+max);
        int arryreverse[] = reverseArray(arr,count);
        int arryreverse2[] = reverseArray2(arr,count);
        for (int y: arryreverse ) {
            System.out.println(y);
        }

        for (int y: arryreverse2) {
            System.out.println("--> "+y);
        }

       int [] printSorted = bubbleSort(arr);
        for (int x: printSorted
             ) {
            System.out.println("Sorted Array is   "+x);
        }
    }


    public static int []readingArray(int count){
        int [] array = new int[count];
        for (int i=0; i<array.length;i++){
            System.out.println("Enter array element");
            int value = scanner.nextInt();

            array[i]=value;
        }
        return array;
    }

    public static int minValue(int [] arr){
        int min = Integer.MAX_VALUE;
        System.out.println("min val pre   4"+min);
        for (int i=0;i<arr.length;i++){
            int value = arr[i];
            if (value<min){
                min = value;
            }
        }
        return min;
    }
    public static int maxValue(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            int value = arr[i];
            if (value>max){
                max = value;
            }
        }
        return max;
    }


    public static int[] reverseArray(int []arr, int count){
        int [] reversed = new int[count];
        for (int i=arr.length-1;i>=0;i--){
            reversed[i]=arr[i];
        }
        return reversed;
    }

    public static int[] reverseArray2(int []arr, int count) {

        int maxIndex = arr.length-1;
        int halfValue = arr.length/2;
        for (int i=0;i<halfValue;i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
           arr[maxIndex-i] =temp;
        }
            return arr;
    }

    public static int [] bubbleSort(int [] arr){

        int temp = 0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr [i+1];
                arr[i+1] = temp;
            }

        }
        return arr;

    }
}
