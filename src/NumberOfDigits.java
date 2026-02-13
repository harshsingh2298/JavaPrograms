import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        long number = sc.nextLong();
        int a = 0;
        if (number<0){
            number = number*-1;
            System.out.println(number);
        } else if (number==0) {
            System.out.println(1);
        } else if (number>0) {
            while (number>0){
                number = number/10;
                a++;
            }
            System.out.println(a);
        }
    }
}
