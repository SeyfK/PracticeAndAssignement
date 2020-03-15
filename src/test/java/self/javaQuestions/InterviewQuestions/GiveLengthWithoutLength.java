package self.javaQuestions.InterviewQuestions;

public class GiveLengthWithoutLength {
    public static void main(String[] args) {
       // give me length of a string without using length method
        String str = "abcd";
        int count = 0;
        for (int i: str.toCharArray()){
            count++;
        }
        System.out.println(count);

    }
}
