package org.example;

public class SwapTwoNum {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            // Swapping using XOR
            a = a ^ b; // a = 15 (5 ^ 10)
            b = a ^ b; // b = 5 (15 ^ 10)
            a = a ^ b; // a = 10 (15 ^ 5)

            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }

