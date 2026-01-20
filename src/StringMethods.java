import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello Harsh To Java";
        String str2 = "hello harsh to java";

        List<String> fruits = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Grape");

        // Filter the list to get fruits with more than 4 characters
        List<String> longFruits = fruits.stream()
                .filter(x -> x.length()>6)
                .collect(Collectors.toList());
        fruits.stream().map(String :: toUpperCase).collect(Collectors.toList()).forEach(x-> System.out.println("Map function and collect and foreach"+x));

        longFruits.stream().forEach(x -> System.out.println("New Fruits are "+x));






       // using length method
        System.out.println(str.length());

        // using index method
        System.out.println(str.charAt(6));

        // using sub string method
        System.out.println(str.substring(0,9));

        // using check contains specific sequence
        System.out.println(str.contains("harsh"));

        // using contains lower and upper case
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // use to trim string
        System.out.println(str.trim());

        // use equals and equals ignore case
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        // replace words in string
        System.out.println(str.replace("a", "o"));

        System.out.println(str);

        String str3 = new StringBuilder(str).replace(5,9,str2).toString();
        String str4 = new StringBuilder(str).delete(5,9).toString();
        System.out.println(str3);
        System.out.println(str4);

        Greeting greeting = (name) -> "Hello, " + name;

        // Use the functional interface instance
        System.out.println(greeting.sayHello("Harsh")); // Output: Hello, John
        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr).forEach(x -> System.out.println("using stream function"+x));
       // Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr)
                .filter(x-> x%2==0)
                .forEach(x-> System.out.println("filter fun"+x));


        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(10)); // true

    }
}
@FunctionalInterface
interface Greeting {
    String sayHello(String name);

}