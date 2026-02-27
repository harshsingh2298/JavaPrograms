import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Fibbonnaci {
    public static void main(String[] args) {


        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;

        int num = 20;
        int a = 0;
        int b = 1;
        int next = 0;

        Fibbrecursion fibbrecursion = new Fibbrecursion();
        int print = fibbrecursion.fib(num);
        int[] reversed = fibbrecursion.reverse(arr,start,end);
        System.out.println(Arrays.toString(reversed));
        System.out.println("Recursion fib "+print);

        for (int i=0; i<=num-1;i++){
            System.out.print(a+" ,");
            next = a+b;
            a=b;
            b=next;
        }

        System.out.println();

        // using BigInteger


        String a1 = "0";
        String b1 = "1";
        System.out.println("Using BigInt");

        for (int i=0;i<=num;i++){
            System.out.print(a1+" ,");
            BigInteger next1 = new BigInteger(a1).add(new BigInteger(b1));
            a1=b1;
            b1 = next1.toString();
        }


        // using Streams
        System.out.println("Using java 8 Streams");

        Stream.iterate(new int[]{a, b},
                f -> new int[]{f[1], f[0] + f[1]})
                .limit(num)
                .map(f -> f[0])
                .forEach(n -> System.out.println(n));

    }

}
//        ======================================== Using Recursion ======================================================
 class Fibbrecursion {
    int [] reverse (int [] arr,int start,int end){
        if (start>=end){
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr,start+1,end-1);

        return arr;

    }
    int fib(int num) {
        if (num <= 1) {

            return num;
        }
        int result = fib(num-1)+fib(num-2);
        return result;
    }
}
