public class Factorial {
    public static void main(String[] args) {
        int num =29;
        int factorial = 1;

        for (int i= 1;i<=num;i++){
            System.out.print(factorial+"* ");
            factorial = factorial*i;
        }
        System.out.println("= "+factorial);



//============================================ Reverse number ==================================================
//                    Also Pelindrome number

        int num2 = 33434;
        int x = num2;
        int rev =0,temp;
      while (num2>0) {
          temp = num2 % 10;
          rev = rev * 10 + temp;
          num2 = num2 / 10;
      }
        System.out.println(rev);
      if (rev==x){
          System.out.println("number is palendrome");
      }else System.out.println("not a pelindrome");

    }


}
