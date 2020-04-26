package self.javaQuestions.InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Magic3_Method {
    public static void main(String[] args) {
        System.out.println(magic("java"));

    }


    //magic code

    public static String magic(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : str.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);

        }

        //  return map.entrySet().stream().map(key-> key.getKey()).collect(Collectors.joining());
        // return map.entrySet().stream().map(val->val.getValue()+val.getKey()).collect(Collectors.joining());
        return map.entrySet().stream().filter(val -> val.getValue() == 1).map(key -> key.getKey()).collect(Collectors.joining());


//    public static String magic(String str){
//        Map<String, Integer > map = new LinkedHashMap<>();
//        for ( String s :str.split("")  ){
//            map.put(s, map.getOrDefault(s,0)+1);
//        }
//        //return map.entrySet().stream().map(key->key.getKey()).collect(Collectors.joining()); //remove dup
//       // return map.entrySet().stream().map(val->val.getValue()+val.getKey()).collect(Collectors.joining()); //frequency
//        return map.entrySet().stream().filter(val->val.getValue()==1).map(key->key.getKey()).collect(Collectors.joining()); //find unique
//    }

    }
}