package self.javaQuestions.InterviewQuestions;

public class FindMaximum {
    public static void main(String[] args) {
        int a [] = {2,3,4,5};
       //System.out.println(FMaxA(a));

            System.out.println(maxValue(a));
    }


    public static int maxValue(int[] n){
        int max = Integer.MIN_VALUE;

        for( int i =0; i< n.length; i++){
            if(n[i]>max)
                max=n[i];

        }
        return max;

    }

 public static int FMaxA(int[] nums){
     int second=0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            if(nums[i]>max)    {
               second =nums[i];
                max=nums[i];
            }
            if(second<max){

            }
        }
return second;
 }



















}

  /*  To find the maximum number in an Array, I need to a for loop and make comparison.

        First, I declare an int max number which equals to the Minimum Value of Integer.

        Inside the loop, if the value in an index is greater than int max; I assign that value to max.

        My method returns max. */












