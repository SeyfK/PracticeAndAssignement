package self.javaQuestions.InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AAPractice {

    public static void main(String[] args) {
        System.out.println(magic("java"));
    }

    public static String magic(String str){

        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s : str.split("") ){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        return map.entrySet().stream().filter(val->val.getValue()==1).map(key->key.getKey()).collect(Collectors.joining());

    }
}
