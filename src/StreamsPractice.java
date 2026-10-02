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
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).findFirst().orElse(null));
        System.out.println(nm);

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

    }
}
