import java.util.*;
import java.util.stream.Collectors;

public class NewPractice {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 40, 20, 50, 30, 60);
//Using Streams, return the unique even numbers greater than 20, sorted in descending order.

        List<Integer> result = numbers.stream().distinct()
                .filter(n->n>20 && n%2 ==0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println(result);



        List<String> names =
                Arrays.asList("Rahul", "Amit", "Raj", "Rohit", "Ankit", "Ravi");
//        Keep names whose length is greater than 4
//        Convert them to uppercase
//        Sort alphabetically
//        Collect into a List
        List<String> resultName = names.stream()
                .filter(n->n.length()>4)
                .map(String::toUpperCase).sorted()
                .collect(Collectors.toList());


        System.out.println(resultName);


        List<Integer> numbers2 =
                Arrays.asList(10, 20, 30, 40, 50);

        //using foreach print this with method refrence

        numbers2.stream().forEach(System.out::println);

      long count =  numbers2.stream().filter(n->n>20).count();
        System.out.println(count);





        List<Integer> numbers3 =
                Arrays.asList(5, 12, 18, 25, 30, 40);

       // Find the first number greater than 20 using Streams and print it safely using Optional.

        numbers3.stream().filter(n->n>20).findFirst().ifPresent(System.out::println);




        List<Integer> numbers4 =
                Arrays.asList(10, 20, 30, 40, 50);

//        Write three statements:
//        Check if any number is greater than 45.
//        Check if all numbers are greater than 5.
//        Check if no number is negative.
//        Use anyMatch(), allMatch(), and noneMatch() respectively.
       boolean res = numbers4.stream().anyMatch(n->n>45);
        boolean res2 = numbers4.stream().allMatch(n->n>5);
        boolean res3 = numbers4.stream().noneMatch(n->n<0);

        System.out.println(res+" "+res2+" "+res3);




        List<Integer> num =
                Arrays.asList(5, 10, 15, 20, 25);


      //Using reduce(), calculate the sum of all numbers.

        long sum = num.stream().reduce(0,Integer::sum);
        System.out.println(sum);




        List<String> names1 =
                Arrays.asList("Amit", "Rahul", "Raj", "Rohit", "Ankit", "Ravi");

       // Group the names by their length using Collectors.groupingBy().

        Map<Integer,List<String>> newNames = names1.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(newNames);



        List<String> newNum =
                Arrays.asList(
                        "Amit", "Rahul", "Raj",
                        "Rohit", "Ankit", "Ravi"
                );

        //understand groupBy  and downstream as counting()

        Map<Integer,Long> rel = newNum.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));

        System.out.println(rel);


        List<Integer> freq =
                Arrays.asList(10, 20, 10, 30, 20, 40, 10, 30);

        //find frequency of each number

        Map<Integer,Long> freqResult = freq.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(freqResult);


        List<String> duplicateName = Arrays.asList(
                "Amit", "Rahul", "Amit", "Raj",
                "Rahul", "Amit", "Rohit"
        );

        //find most repeated name

      //  String repName = duplicateName.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));


        List<String> wordsArray = Arrays.asList("listen", "pot", "silent", "top", "enlist", "opt", "hello");


        Map<String,List<String>> groupedAnagram = wordsArray.stream().collect(Collectors.groupingBy(word-> {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }));

        System.out.println(groupedAnagram);


    }
}
