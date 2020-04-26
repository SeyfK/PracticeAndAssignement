package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxOccuringCharacter {
    public static void main(String[] args) {

        System.out.println(maxOccuringCharacter("I love java, how about you?"));


    }

    public static String maxOccuringCharacter(String s) {
        Map<String,Integer> uni=new HashMap<>();
        for(String st:s.replaceAll("\\s+","").split("")) {
            uni.put(st,uni.getOrDefault(st,0)+1);
        }

        return uni.entrySet().stream()
                .max((x,y)->x.getValue().compareTo(y.getValue()))
                .map(x->x.getKey()+x.getValue())
                .get();
    }


}