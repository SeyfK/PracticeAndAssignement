package self.javaQuestions.InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("palindrome string:" +palindromeString("ey edip adanada pide ye"));

    }

    public static boolean palindromeString(String  str){
        String reversed="";
        for (int i = str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);


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


















}
