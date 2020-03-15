package self.javaQuestions.InterviewQuestions;

import java.util.Arrays;

public class ArrayMiddleNumber {
    public static void main(String[] args) {
       int[]a={1,2,3,4,5};
    System.out.println(Arrays.toString(findMiddle(a)));;

    }

    public static int[] findMiddle(int[] nums) {
        int[] a;
        if (nums.length %2 == 0) {
            // even-length array (two middle elements)
            a = new int[2];
            a[0] = nums[(nums.length/2) - 1];
            a[1] = nums[nums.length/2];
        } else {
            // odd-length array (only one middle element)
            a = new int[1];
            a[0] = nums[nums.length/2];
        }
        return a;
    }

}
