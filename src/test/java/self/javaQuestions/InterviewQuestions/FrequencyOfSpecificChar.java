package self.javaQuestions.InterviewQuestions;

public class FrequencyOfSpecificChar {
    public static void main(String[] args) {


    String str="javajava";
   String specificChar="a";
    int count= 0;
    for(int i = 0; i<str.length(); i++) {
        if(specificChar.equalsIgnoreCase(""+str.charAt(i))) {
            count++;
        }
    }
System.out.println("frequency of "+specificChar+" is: "+ count);



}

}
