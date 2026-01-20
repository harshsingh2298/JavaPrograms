import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str = scan.nextLine();

//        System.out.println("ENTER NUMBER");
//        int num = scan.nextInt();

        int left = 0 , right = str.length()-1;

        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
            System.out.println("Its a palindrome "+str);
            return;
        }







        String revStr = "";

        for (int i=str.length()-1;i<=0;i++){
            System.out.println(i);
            revStr=revStr+str.charAt(i);
            System.out.println(revStr);
        }
        if (revStr==str){
            System.out.println("Its Palindrome ");
        }else
            System.out.println("Not palindrome");


    }
}
