package self.javaQuestions.InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {

        //palindromeInt cemre abla
        System.out.println("cemre abla methodu int palindrome:   "+palindromeInt(55));
        String str = "level";
        //
        String reverse="";

    boolean yesSir =true;
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
            //avaj
        }
        if(reverse.equalsIgnoreCase(str)) {
            System.out.println(yesSir);
        }else {
            System.out.println("This friend is not a palindrome");

        }
      //  System.out.println(isPalindrome(99));
    }

    //int palindrome
    public static boolean isPalindrome(int number) {
        //
        int palindrome=number;
        int reverse=0;

        while(palindrome!=0) {
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(number==reverse) {
            return true;
        }
        return false;

    }

//int palindrome cemre abla methodu
    public static boolean palindromeInt(int num){
      String str= Integer.toString(num);
      String reversed="";
      for (int i = str.length()-1; i>=0; i--){
          reversed+=str.charAt(i);
      }
        return str.equalsIgnoreCase(reversed);


    }








}
