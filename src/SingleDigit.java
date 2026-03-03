import java.io.FilterOutputStream;

public class SingleDigit {
    public static void main(String[] args) {
        int number = 183;

        if (number == 0) System.out.println(0);
        System.out.println( 1 + (number - 1) % 9);
        // now i want to split the number in two and add until added number should be single digit
        int sum =0;

        while (number>9){
            while (number>0) {
             int temp = number % 10;
                sum = sum + temp;
                number = number / 10;
            }
            int result = sum;
            sum = 0;
                number = result;
                System.out.println(result);
            }
        }

    }

