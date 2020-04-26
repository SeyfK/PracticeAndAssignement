package self.javaQuestions.InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_With_Map {
    public static void main(String[] args) {

        String word = "aaabbbbccaadef";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<word.length(); i++){
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }else{
                map.put(word.charAt(i), map.get(word.charAt(i))+1);
            }
        }

//    for(Map.Entry each: map.entrySet()){
//
//        System.out.println("word contains "+each.getValue()+" times "+each.getKey());
//    }



        map.forEach((k, v) -> {
            System.out.println("word contains " + v + " times " + k + " character");
        });












//        String word = "aaabbbccccdfe";
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0; i< word.length(); i++){
//            if( !map.containsKey(word.charAt(i))){
//                map.put(word.charAt(i), 1);
//            }else {
//                map.put(word.charAt(i), map.get(word.charAt(i))+1);
//            }
//
//        }
//
//map.forEach((k,v)->{
//    System.out.println("word contains "+v+ " times "+k+" character");
//});


    }
}
