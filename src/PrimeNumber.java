package org.example;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (findPrimeNumber(number)){
            System.out.println("Number is Prime "+number);
        }else
            System.out.println("Number is Not a Prime Number "+number);

        febo(number);
    }


    public static boolean findPrimeNumber(int number){
        for (int i=2;i<=number/2;i++){
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void febo(int number){
        int first = 0;
        int second = 1;
        int next = 0;

        for (int i=0;i<=number;i++){
            System.out.println(" - "+first);
            next = first+second;
            second = first;
            first = next;
        }
    }


}
