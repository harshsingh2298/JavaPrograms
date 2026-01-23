import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] str = new String[]{"flower","flow","fly"};

        // now i need to find the longest prefix int his string array
        char [] commonPrefix = new char[10];

        for (int i=0;i< str.length;i++){             // flower, flow, fly
           String word = str[i];                     // flower
           for (int j=0;j<word.length();j++){        // f,l,o,w,e,r
               commonPrefix[j] = word.charAt(j);
           }
           if ()

        }
        System.out.println(Arrays.toString(commonPrefix));
    }
}
