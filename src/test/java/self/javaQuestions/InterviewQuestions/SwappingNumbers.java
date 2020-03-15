package self.javaQuestions.InterviewQuestions;

public class SwappingNumbers {
    public static void main(String[] args) {

        int   x = 20;
        int  y =30;

// Swapping numbers
        x= x+y;
        y=x-y;
        x=x-y;

        System.out.println("x= "+x+ " and y= "+y);



    }
}
