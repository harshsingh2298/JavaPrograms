package org.example;

import java.util.Scanner;

public class LinearSearch {


    public static int [] searchArray(int [] arr, int key){
        for (int i=0;i< arr.length;i++) {
         if (arr[i]==key) {
             System.out.println("Match Fount on index ==>" + i);
         }

        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {12,22,54,67,44,987,33,26};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Key");
        int key = scanner.nextInt();
        searchArray(arr,key);
    }
}
