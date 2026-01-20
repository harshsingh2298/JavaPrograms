import java.math.BigInteger;
import java.util.stream.Stream;

public class fibbonnaci {
    public static void main(String[] args) {
        int num = 20;
        int a = 0;
        int b = 1;
        int next = 0;

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
