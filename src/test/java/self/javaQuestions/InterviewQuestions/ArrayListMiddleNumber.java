package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ArrayListMiddleNumber {


    public static void main(String[] args) {
        mid();

    }


    public static void mid(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int mid = list.get(list.size()/2);
        System.out.println("mid number is "+mid);

    }
}
