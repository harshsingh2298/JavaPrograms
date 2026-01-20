import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 6};

        int index = 1; // position for next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        // index = number of unique elements
        System.out.println("Count = " + index);

        // print unique elements
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        // Move all the negative Interger to the left =============================================

        int[] arr1 = {0, 3, 2, -1, -4, 5, -8, 9, 0, -3};

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                int temp = arr1[i];
                arr1[i] = arr1[count];
                arr1[count] = temp;
                count++;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }


}
