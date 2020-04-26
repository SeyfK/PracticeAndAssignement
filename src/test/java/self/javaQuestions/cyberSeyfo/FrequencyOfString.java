package self.javaQuestions.cyberSeyfo;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfString {
    public static void main(String[] args) {
        String word = "aaaafffslddljkbbbccaaaacdefccc";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i= 0; i<word.length(); i++){
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            }else {
                map.put(word.charAt(i), map.get(word.charAt(i))+1);
            }
            //{ a,4  },  {b,3   }


        }
//        for(  Map.Entry each : map.entrySet()){
//            System.out.println("word contains "+ each.getValue()+ " times "+each.getKey());
//        }

        map.forEach( ( k,v ) ->{
          //  if(v==1)      // to get unique caracter
            System.out.println("word contains "+ v+ " times "+k);
        } );

    }
}
