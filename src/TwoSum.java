package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class twoSum {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 3, 6, 5, 7, 9};
        int target = 15;

        // Use HashMap for maximum performance (O(1) lookups)
        Map<Integer, Integer> map = new HashMap<>();

        IntStream.range(0,arr.length).filter(i->{
            int current = arr[i];
            int reminder = target-current;
            if (map.containsKey(reminder)){
                System.out.println(reminder+" using stream "+current);
            }
            map.put(current,i);

            return false;
        }).toArray();





//
//
//        // Single pass through the array
//        for (int i = 0; i < arr.length; i++) {
//
//            int currentNum = arr[i];
//            int complement = target - currentNum;
//
//            // Look backward: Is the number we need already in the map?
//            if (map.containsKey(complement)) {
//                // Found a pair! Print the numbers
//                System.out.println(currentNum + " and " + complement);
//
//                // If you want to print indices:
//                // System.out.println("Indices: " + i + " and " + map.get(complement));
//            }
//
//            // Add the current number and its index to the map for future elements to find
//            map.put(currentNum, i);
//        }
    }
}