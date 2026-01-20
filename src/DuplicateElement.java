import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 7, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate found: " + arr[i]);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("true");
            }
            set.add(num);
        }

        System.out.println("false");
    }
}
