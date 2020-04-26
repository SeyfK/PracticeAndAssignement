package self.javaQuestions.cyberSeyfo;

public class SwappingNumbers {
    public static void main(String[] args) {

        //method 1
//        int a =20;
//        int b =30;
//
//        int temp =a;  // 20
//        a=b;  //30
//        b=temp; // 20

       // System.out.println("a is:"+a+" b is:"+b);


        //method 2
//        int a =20;
//        int b =30;
//        a+=b-(b=a); //a=30  b=20
//        System.out.println("method 2 a is:"+a+" b is:"+b);


        //method 3
       int a =20; //30
        int b =30; //20
         a= a+b; // 20 +30= 50
        b=a-b;   //50 - 30 = 20
        a= a-b;  //50 - 20 = 30
        System.out.println("method 3 a is:"+a+" b is:"+b);


    }


}
