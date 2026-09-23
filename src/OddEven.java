package org.example;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check odd even");
        int number = scanner.nextInt();
        findOddOrEven(number);

    }
    public static void findOddOrEven(int number){
        if (number % 2 == 0){
            System.out.println("Number is even "+number );
        }else
            System.out.println("Number is odd "+number);
    }

}
