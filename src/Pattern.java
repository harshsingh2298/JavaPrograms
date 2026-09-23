package org.example;

import java.util.Arrays;

public class Pattern {

    // In this class i am trying to print the square of stars with 4 rows and 5 column
    // first i will declare one for loop for the row and inside it one more for loop for column
    // according to pattern i have to give for loop conditions

    public void squarePattern(){
        for (int i=0;i<5;i++){
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.print("*");
            }
        }
        System.out.println("");
        int [] arr = {101,110,106,144,107,109};
        int temp = 0;
        for (int j=0;j< arr.length;j++){
        for (int i =0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
               temp = arr[i];
               arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }


    }
        for (int x:arr
        ) {
            System.out.println("Bubble Sort"+x);

        }
    }
}
