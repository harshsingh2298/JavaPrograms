import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWord {
    public static void main(String[] args) {
        String word = "Hi my name is harshsingh and this is java code";
        String[] characters = word.split("\\s+");

        System.out.println(Arrays.toString(characters));

        String longestWord = "";
        int counter = 0;

        for (int i=0;i<characters.length;i++){
           // int currentWordLength = characters[i].length();
         //   if (currentWordLength>counter){
            if (characters[i].length()>counter){
                counter = characters[i].length();
                longestWord = characters[i];

            }
        }
        System.out.println(longestWord);


        System.out.println("Using Streams.................");


        String longest = Arrays.stream(word.split("\\s+"))
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(longest);

    }
}
