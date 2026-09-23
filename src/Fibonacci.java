package org.example;

import java.util.Scanner;

public class Fibonacci {

    // for creating fibonacci series
    // step1 start
    // step2 for loop from index 0
    // add index 0+0 then 0+1 then 1+2 then 2+3
    // print the output
    // end
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number till where you want fibonacci" );
        int n = scanner.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm =0;
        // 0 1 1 2 3 5 8 13 21 ..............

        for (int i = 0;i<n; ++i){
            System.out.println(firstTerm+" ");
          nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
    }
}
