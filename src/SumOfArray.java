import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {

        // Sum off array elements
        // Declaring an array of integer
        int []arr = new int[]{9,8,7,6,5,4,3,2,1};

        // Printing the array elements
        System.out.println(" Array Elements are : "+ Arrays.toString(arr));

        // Declaring a variable of integer type as sum
        int sum=0;

        // Traversing the array using for loop for sum
        for( int i=0;i<= arr.length;i++){
            sum+=arr[1];
        }
        // Printing the sum of array
        System.out.println(" Sum of array elements is : "+sum);
    }
}
