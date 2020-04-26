package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Search_Count {

    public static void main(String[] args) {
        System.out.println(search("java is great i reallly like java", "a")); //how many time a occurs in the first string
    }



    public static int search(String str,String s) {
        return (int) Arrays.stream(str.split(""))
                .filter(x->x.equals(s))
                .count();

    }



}