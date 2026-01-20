import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int [] arr = new int[]{-1,0,-3,0,9,6,3,4,2};

        int start = 0 ,count=0;
        //now i have to move the zeros to the end
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[start] = arr[i];
                start++;

            }

        }
        for (int i = start; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));


    }
}
