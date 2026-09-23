package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class countString {
    public static void main(String[] args) {
        String input = "banana";
        char[] ch = input.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();


        IntStream.range(0, ch.length).forEach(i->{
            char current = ch[i];
            if (map.containsKey(current)){
                int count = map.get(current);
                map.put(current,count+1);
            }else {
                map.put(current,1);
            }

        });
        System.out.println("with streams "+map);



        for (int i=0;i< ch.length;i++){

            char current = ch[i];
            if (map.containsKey(current)) {
                int count= map.get(current);
                map.put(current,count+1);
            }else{
            map.put(current, 1);
            }
        }
        System.out.println(map);

        }
    }

