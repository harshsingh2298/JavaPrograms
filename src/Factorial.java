import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER FOR FACTORIAL");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 2; i <= num; i++) {
            System.out.println(factorial + "*");
            factorial = factorial * i;
        }
        System.out.println("= " + factorial);


//============================================ Reverse number ==================================================
//                    Also Pelindrome number

        int num2 = 33434;
        int x = num2;
        int rev = 0, temp;
        while (num2 > 0) {
            temp = num2 % 10;
            rev = rev * 10 + temp;
            num2 = num2 / 10;
        }
        System.out.println(rev);
        if (rev == x) {
            System.out.println("number is palendrome");
        } else System.out.println("not a pelindrome");


//    ================================ fibonacci=================================================

        int feb = 20;
        int first = 0, second = 1, temp1=0;
        for (int i=0;i<feb;i++){
            System.out.println(first);
            temp1 = first+second;
            first = second;
            second = temp1;

        }

    }

}
