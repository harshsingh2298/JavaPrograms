import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] str = new String[]{"flower","flow","fly"};

        // now i need to find the longest prefix int his string array
        char [] commonPrefix = new char[10];
          int num =1;
        char  a = 0;
        for (int i=0;i< str.length;i++){             // flower, flow, fly
           String word = str[i];

           for (int j=0;j<num;j++){
                 a = word.charAt(j);

               if (word.charAt(num)==a){
                   commonPrefix[j] = word.charAt(num);
                   num ++;
               }
           }

        }
        Object obj = new String("Hello, world!");
        Class c = obj.getClass();
        System.out.println(c.getName());
        System.out.println(Arrays.toString(commonPrefix));

    }
}
