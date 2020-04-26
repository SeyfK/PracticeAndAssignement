package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;

public class ArrayMiddleNumber {
    public static void main(String[] args){
        int[] a= {1,2,3,4,5,6,7};
        System.out.println((Arrays.toString(midArray(a))));
}


    public static int[] midArray(int[] num){
        int[] a;

        if(num.length%2==0){
            a= new int[2];
            a[0]= num[(num.length/2)-1];
            a[1]= num[num.length/2];
        }else{
            a= new int[1];
            a[0]= num[num.length/2];
        }
        return a;


    }

}
