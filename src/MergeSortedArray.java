import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};

        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

//        // Copy remaining elements of array a
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }
//
//        // Copy remaining elements of array b
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(result));




        int e=0,d=0,c=0;
        int [] fin = new int[a.length+b.length];

        while (e<a.length && d< b.length){
            if (a[e]<b[d]){
                result[c]= a[e];
                d++;
            }if (a[e]>b[d]){
                result[c] = b[d];
                e++;
            }

            c++;
        }
    }
}
