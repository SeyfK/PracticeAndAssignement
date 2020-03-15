package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class FindUnique {

    public static void main(String[] args) {
        System.out.println(unique("aaabbbcde"));
    }

    /*
    3. Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    //Solution 1:
    public static String unique(String str) {
        String unique1="";

        for (int i = 0; i <str.length() ; i++) {
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                if(("" + str.charAt(i)).equals("" + str.charAt(j))){
                    count++;
                }
            }
            if (count ==1){
                unique1+= str.charAt(i);
            }
        }
        return unique1;
    }


  //  Solution 2:
    public static String Unique(String str) {
        String result ="";
        for(String each : str.split(""))
            result += ( (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
        return result; }






}




