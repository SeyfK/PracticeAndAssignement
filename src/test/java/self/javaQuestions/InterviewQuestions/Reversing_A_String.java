package self.javaQuestions.InterviewQuestions;

public class Reversing_A_String {
    public static void main(String[] args) {
        System.out.println(StrReverse2("Hello"));
    }
    //solution 1
    public static String StrReverse2(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.charAt(i);
        return reverse;

      /*  I declare an empty String. Then I run a for loop.
      Loop starts from the last index of the String until the 0th index.
  Inside the loop, I use charAt method of String class.
  I keep adding characters to the empty String as the loop runs.
  Each time, characters will be added,
  starting from the last Char in the original String until the first.
After the loop finishes, all characters are added to empty String in reverse order.  */

    }



    //   Solution 2
    public  static String  StrReverse(String str2) {
        return new StringBuffer(str2).reverse().toString();
    }
}
