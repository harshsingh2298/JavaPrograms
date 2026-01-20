import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = new int[]{12,32,3,4,78,34,5,7,2,1,5,6,8,9};
        Arrays.sort(arr);
        // Two pointer method but original index is lost
        int target = 14;
        int first = 0;
        int last = arr.length-1;
        while (first<last){
            int sum = arr[first] + arr[last];

            if (sum == target){
                System.out.println("first "+arr[first] +"+"+"last "+arr[last] +"="+sum);
                break;
            } else if (sum <target) {
                first++;
            }else {
                last--;
            }
        }
         // HasMap Method ============================================

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(
                        "Indexes: " + map.get(complement) + " , " + i
                );
                System.out.println(
                        "Values: " + complement + " + " + arr[i] + " = " + target
                );
                break;
            }

            map.put(arr[i], i);
        }

    }
}
