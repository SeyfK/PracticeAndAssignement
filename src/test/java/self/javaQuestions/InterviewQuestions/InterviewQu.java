package self.javaQuestions.InterviewQuestions;

public class InterviewQu {
    public static void main(String[] args) {
//ask parsa bro
        int a =10, b=20, c=30;
        a = b%5;
        b = c%5;
        c= a*b;
        System.out.println(a+" "+b+" "+c);


        String str = "AAABBDCA";
      String temp= "";
        int  count=0;
        for (int i = 0; i<str.length(); i++){
    temp+=str.charAt(i);
            if (temp.equalsIgnoreCase(""+str.charAt(i))){
               count++;
             //   System.out.println(count+temp);
            }


        }
        System.out.println(count+temp);



    }
}
