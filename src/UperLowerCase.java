import java.util.Scanner;

public class UperLowerCase {
    public static void main(String[] args) {

        // Print all the letters in uppercase and lower case
        // Taking alphabet from scanner creating scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ENTER THE LETTER OR WORD ");

        // Creating String object to store user input
        String word = scanner.next();

        // Converting the word in upper case
        System.out.println(" Word in UpperCase Is : " +word.toUpperCase());

        // Converting the word in lower case
        System.out.println(" Word in LowerCase is : "+word.toLowerCase());


    }
}
