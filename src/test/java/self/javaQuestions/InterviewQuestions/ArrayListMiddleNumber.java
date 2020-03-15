package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ArrayListMiddleNumber {


    public static void main(String[] args) {
findArrayListMiddleNumber();

    }


    public static void findArrayListMiddleNumber(){

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        int mid = num.get(num.size()/2);
        System.out.println("mid number is "+mid);


    }
}
