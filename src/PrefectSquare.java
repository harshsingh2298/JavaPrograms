public class PrefectSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 121;
        boolean answer = solution.isPerfectSquare(num);
        boolean answer2 = solution.isPerfectSquareBinary(num);
        boolean answer3 = solution.isPerfectSquareMath(num);
        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}
class Solution {

    public boolean isPerfectSquareBinary(int num){
// Base case: 1 is a perfect square
        if (num == 1) return true;

        long low = 1;
        long high = num;

        while (low <= high) {
            // Calculate mid inside the loop to update it every time
            long mid = low + (high - low) / 2;
            long sq = mid * mid;

            if (sq == num) {
                return true; // Found it!
            } else if (sq > num) {
                high = mid - 1; // Square is too big, look at the lower half
            } else {
                low = mid + 1; // Square is too small, look at the upper half
            }
        }
        return false;
    }
    public boolean isPerfectSquare(int num) {
        //to find perfect square i need to first go half of the number and then find the perfect square
        if(num == 1){
            return true;
        }

        int half = num/2;
        for(int i=2;i<=half;i++){
            long sq = (long)i*i;
            if(sq>num){
                break;
            }
            if(sq == num){
                return true;
            }
        }   return false;
    }

     boolean isPerfectSquareMath(int num){

             // Step 1: Get the square root as a double
             double root = Math.sqrt(num);

             // Step 2: Check if the root is an integer
             // (Floor of the root should equal the root itself)
             return (root == (int)root);

     }
}
