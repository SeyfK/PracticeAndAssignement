package self.javaQuestions.InterviewQuestions;

public class FindSecondMaximum {

    public static void main(String[] args) {
        int a [] = {2,3,4,5};
        //System.out.println(FMaxA(a));

        System.out.println(maxValue(a));
    }


    public static int maxValue(int[] n){
        int max = Integer.MIN_VALUE;

        for( int i =0; i< n.length; i++){
            if(n[i]>max)
                max=n[i]-1;

        }
        return max;

    }}

