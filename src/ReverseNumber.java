import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[]{12,23,34,56,78,90,32,11,43,54,33};

//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 == 0) {
//                System.out.println(arr[i]);
//            }
//        }
        Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);


        System.out.println("array = "+ Arrays.toString(arr));
        System.out.println("reverse = " +
                IntStream.rangeClosed(1, arr.length)
                        .map(i -> arr[arr.length - i])
                        .boxed()
                        .collect(Collectors.toList()));

        int number = 87368236;
        int rev =0;
        while (number!= 0){
        int temp = number % 10;
        rev = rev * 10 + temp;
        number = number/10;

    }
        System.out.println("Number in reverse = "+rev);








        // Programme to reverse print the number
     // Declaring a variable for storing the number and storing the reverse number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number1 = scanner.nextInt();
        int reverse = 0;
     // printing the given number
        System.out.println("The number is : "+number1);

     // Using while loop for traversing the number until its 0
            while(number1 != 0)
            {
      // declaring the variable reminder for storing the reminder number
                int remainder = number1 % 10;
      // for storing the reminder and add it to reversed number
                reverse = reverse * 10 + remainder;
      // for reducing the number by digit everytime loop runs
                number1 = number1/10;

            }
            System.out.println("The reverse of the given number is: " + reverse);
        }




    }






