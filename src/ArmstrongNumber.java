public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = 0, arm=0;
        int x = num;

        while (num>0){
            temp = num%10;
            num = num/10;
            arm = arm + temp*temp*temp;
        }
        if (arm == x){
            System.out.println("Number is Armstrong");
        }else System.out.println(" its not a armstrong ");

//================================================== Number of digits =======================================================

       int no = -567, a=0;

        if(no<0) {
            no = no * -1;
        }
        else if (no==0) {
            no=1;
        }
        while(no>0) {
            no=no/10;
            a++;
        }
        System.out.println("Number of digits in given number is :" +a);
    }
}
