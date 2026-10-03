import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Integer> nums =
                Arrays.asList(10, 20, 10, 30, 20, 40, 10, 30);
        // find frequency grouping

        Map<Integer,Long> result = nums.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(result);


        List<Integer> nums1 =
                Arrays.asList(10, 20, 10, 30, 20, 40, 10, 30);
         Set<Integer> seen = new HashSet<>();
        //find duplicates
        Set<Integer> list = nums1.stream().filter(n-> !seen.add(n)).collect(Collectors.toSet());
        System.out.println(list);

        String str = "swiss";
//        Map<Character,Long> rs = str.chars().mapToObj(c ->(char) c).filter(c -> rs.get(c) == 1).findFirst().)
//        System.out.println(rs);
        //find first non repeting character


        List<String> names = Arrays.asList(
                "Amit", "Rahul", "Amit", "Raj",
                "Rahul", "Amit", "Rohit"
        );
        Map<String,Long> map =  names.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));


               String nm = String.valueOf(map.entrySet().stream()
                       .sorted(Map.Entry.<String, Long>comparingByValue()
                               .reversed())
                       .findFirst()
                       .orElse(null));

        System.out.println(nm);

        String nm1 = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(nm);
        System.out.println("Better "+nm1);

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String,List<String>> grupAnagram = Arrays.stream(input).collect(Collectors.groupingBy(word->
        {
           char[] ch= word.toCharArray();
            Arrays.sort(ch);
            return new String(ch);


        }));
        System.out.println("Grouped anagram "+grupAnagram);


                List<Integer> list1 = Arrays.asList(1,0,-3,4,0,5,-4,0,8,3);

       List<Integer> zeroToRight = Stream.concat( list1.stream()
               .filter(n-> n!=0),list1.stream()
               .filter(n-> n==0))
               .collect(Collectors.toList());
        System.out.println(zeroToRight);

        List<Integer> moveZeroToLeft = Stream.concat(list.stream()
                .filter(n-> n==0),list.stream()
                .filter(n -> n!=0))
                .collect(Collectors.toList());
        System.out.println("Zero in left "+moveZeroToLeft);



        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        int secondHigh = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Highest Integer "+secondHigh);


        List<Integer> DuplicateNumbers =
                Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30);

        Set<Integer> seen1 = new HashSet<>();

        List<Integer> listOfDuplicate = DuplicateNumbers.stream()
                .filter(n -> !seen1.add(n)).collect(Collectors.toList());

        System.out.println("The list of duplicates "+listOfDuplicate);


        List<String> name = Arrays.asList(
                "Amit", "Rahul", "Amit", "Raj",
                "Rahul", "Amit", "Rohit"
        );

        List<String> duplicateNames = name.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet().stream()  // convert Entry Set int stream as [Amit 2,rahul 2,Raj 1,Rohit 1]
                .filter(e->e.getValue()>1) //then filter from stream the value more then 1
                .map(Map.Entry::getKey) // now get the key of those filtered value
                .collect(Collectors.toList());
        System.out.println("Duplicate Names with Entry Set "+ duplicateNames);



        List<Integer> partioningNum =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // now after groupBy it partionBy

        Map<Boolean,List<Integer>> partionN = partioningNum.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Partion "+ partionN);


        String myName = "Harsh";

// count the alphabets how many time appring
        Map<String,Long> mapp = myName.toLowerCase().chars()
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(mapp);




        // Lets learn flatMap java 8

        List<List<String>> namess = Arrays.asList(
                Arrays.asList("Amit", "Rahul"),
                Arrays.asList("Raj", "Rohit"),
                Arrays.asList("Ankit", "Ravi")
        );

        List<String> ll = namess.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("FlatMap to Nested List "+ll);




        List<List<Integer>> numberss = Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(40, 50),
                Arrays.asList(60, 70, 80)
        );

        // Find Sum of all numbers

        long Nu = numberss.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .stream().reduce(0,(a,b)->a+b);


        long Nu2 = numberss.stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();



        System.out.println("FlatMap and sum "+Nu);
        System.out.println("FlatMap and sum with MapToInt "+Nu2);



        List<Integer> numbe =
                Arrays.asList(10, 20, 30, 40, 50);

                // Sum
                //Maximum
                //Average

        long tt = numbe.stream().mapToInt(Integer::intValue).sum();
        int mx = numbe.stream().mapToInt(Integer::intValue).max().orElse(0);
        double avg = numbe.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("mapToInt "+tt);
        System.out.println("mapToInt Max "+mx);
        System.out.println("mapToInt Avg "+avg);





    }
}
