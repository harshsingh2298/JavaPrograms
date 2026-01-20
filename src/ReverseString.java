import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {


        String str = "HarshSinghRaghuvanshi";
        // Approach one StringBuilder
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        String result = str2.toString();
        System.out.println(result);

        // Approach to swapping with char array
        char [] revStr = str.toCharArray();
        int start = 0;
        int end = revStr.length-1;

        while (start<end){
            char temp = revStr[start];
            revStr[start] = revStr[end];
            revStr[end] = temp;
            start++;
            end--;
        }
        for (char x : revStr
             ) {
            System.out.print(""+x);

        }
        System.out.println();

        // Reverse from loop

        char [] newRevStr =new char[revStr.length];
        int count =0;
        for (int i = revStr.length - 1; i >= 0; i--){

            newRevStr[count] = revStr[i];
            count++;
        }
        for (char x: newRevStr
             ) {

            System.out.print(x);
        }



        // rev using Stream API

        String name = "HarshSinghRaghuvanshi";

        String reversed =
                IntStream.range(0, name.length())
                        .mapToObj(i -> name.charAt(name.length() - 1 - i))
                        .collect(StringBuilder::new,
                                StringBuilder::append,
                                StringBuilder::append)
                        .toString();

        System.out.println(reversed);
    }
}
