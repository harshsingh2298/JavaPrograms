import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class PatternTriangle {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String , Long> map = words.stream().collect(Collectors.groupingBy(word -> word,Collectors.counting()));

        map.forEach((word, count) -> System.out.println(word + " = " + count));










        int number = 4;

        // Outer loop -> controls rows
        for (int i = 0; i < number; i++) {

            // 1. Print spaces
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}