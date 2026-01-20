import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String [] arr = new String[]{"eat", "tea", "tan","nat","bat","sat","tab"};

      //  List<List<String>> group = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            // 1. Convert String to char array
            char[] chars = arr[i].toCharArray();

            // 2. Sort the characters
           // Arrays.sort(chars);

            // 3. Store the sorted string back into the array
            arr[i] = new String(chars);
        }

        // Print result: [aet, aet, ant, ant, abt, ast, abt]

        Map<String, List<String>> map = new HashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        for (List x: result
             ) {
            System.out.println("By Java 8 "+x);
        }

    }
}
