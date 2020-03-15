package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {


        System.out.println(removeDup("Hello"));
        System.out.println(removeDupHash("Hello"));
    }

   // Write a return method that can remove the duplicated values from String
    //Ex:  removeDup("AAABBBCCC")  ==> ABC
    public static  String  removeDup( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }
  /*  First, I declare an empty String.
    Then I run a for loop. The loop runs from 0th index of the original String until the last (str.length-1) index.
    In my if condition inside the loop,
    I compare if each character of the original String is contained in the  empty String.
    If that character is not contained, I concat it to the empty String.
    When the loop finishes, all non duplicate characters are added to the empty String.
    My method returns the String that I declared before the loop.
*/

    public static String removeDupHash(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ","").replace("[","").replace("]","");
        return str;
    }
    //linkedHashSet remove duplicate and keep the order as is
    //after split I'm having each character and then convert it to string
    //then since it's giving me as list with braket and I need to remove

}
