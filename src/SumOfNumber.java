public class SumOfNumber {
    public static void main(String[] args) {
        int number = 23452;

        int sum =0;

        while (number>0){
         int   digit = number%10;
            sum = sum+digit;
            number = number/10;
        }
        System.out.println("Sum "+sum);
    }
}
