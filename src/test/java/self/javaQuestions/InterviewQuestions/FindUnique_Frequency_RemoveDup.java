package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUnique_Frequency_RemoveDup {

    public static void main(String[] args) {
        String string="aaaabbbbccc";
        System.out.println(unique(string));
    }

    public static String unique(String str) {
        Map<String,Integer> mapping=new HashMap<>();
        for(String s:str.split("")) {
            mapping.put(s, mapping.getOrDefault(s, 0)+1); //if s do es not contain s assing 0 if you have add 1
        }                                      //

        return mapping.entrySet().stream()  //entreSet key ve valuse set ediyor streat(filtreleme yapiyor)
              .filter(val->val.getValue()==1) // it will give unique characters  //
                .map(key->key.getKey())   //   it will remove duplicate //hash map rendo order
                //  .map(key->key.getKey()+key.getValue())         // if we write this it will give us frequency of character
                .collect(Collectors.joining()); //collect topla ve bagla
        //stream ve lambda hiz ve guzel cozumler verir perfermans



    }
}
