public class SumOfNumber {

    public static void main(String[] args) {
        SumOfNumber sumO = new SumOfNumber();
        int n =10;
        int result = sumO.sumNumbers(n);
        System.out.println("Sum of number "+result);
        int number = 23452;


        int sum =0;

        while (number>0){
         int   digit = number%10;
            sum = sum+digit;
            number = number/10;
        }
        System.out.println("Sum "+sum);
    }

    int sumNumbers(int n){
        if (n==0){
            return n;
        }
        int result =  n+sumNumbers(n-1);
        return result;
    }
}


