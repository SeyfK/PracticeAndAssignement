package self.javaQuestions.InterviewQuestions;

public class FindMinimum {

    public static void main(String[] args) {
        int a [] = {2,3,4,5};
        System.out.println(minValue(a));
    }


    public static int minValue(int[] n){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n.length; i++){
            if(n[i]<min)
                min=n[i];
        }

        return min;

    }
}

  /*  To find the minimum number in an Array, I need to a for loop and make comparison.
        First, I declare an int min number which equals to the Maximum Value of Integer.
        Inside the loop, if the value in an index is smaller than int min; I assign that value to min.

        My method returns min.
*/



