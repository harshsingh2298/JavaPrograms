import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        char [] str = new char[]{'j','h','k','l','u','t','r','w','c','x','t'};

        int first = 0;
        int last = str.length-1;
        while (last>first){
            char temp = str[first];
            str[first] = str[last];
            str[last] = temp;

            first++;
            last--;
        }
       // Arrays.sort(str);

        //bubble sort
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                // Compare adjacent characters
                if (str[j] > str[j + 1]) {
                    // Swap them if they are in the wrong order
                    char temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        new String(str).chars().forEach(c -> System.out.println("Character: " + (char) c));
    }
}
