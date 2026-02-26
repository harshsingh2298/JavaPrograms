public class PowerOfNumber {
    public static void main(String[] args) {

        Recursion.print(0);
      int result =   Recursion.factorial(5);
        System.out.println("Factorial"+result);
         double x =22.3;
         int n =2;


            // long power = n;

            // if (power < 0) {
            //     x = 1 / x;
            //     power = -power;
            // }

            // double result = 1.0;

            // while (power > 0) {
            //     if ((power % 2) == 1) {   // if power is odd
            //         result *= x;
            //     }

            //     x *= x;        // square the base
            //     power /= 2;    // halve the exponent
            // }

            // return result;

        System.out.println( Math.pow(x, n));




        // ===================================Recursion learning =================================================


        }
       static class Recursion{



       static void print(int n){
            if (n==6){
                return;
            }

            System.out.println(n);

            print(n+1);
        }


         static   int factorial(int n) {
               if (n == 1) return 1;  // Base case

               return n * factorial(n - 1);
           }

        }
    }


