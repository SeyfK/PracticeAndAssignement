package self.javaQuestions.InterviewQuestions;

import java.util.*;

public class Frequency {

    // first way:
    public static void frequencies(String str) {
        String str2 ="", str3="";
        for(int i=0; i<str.length(); i++)
            if(! str2.contains(""+str.charAt(i) ) )
                str2 += str.charAt(i);

        for(int z=0; z<str2.length(); z++) {
            int num=0;
            for(int i=0; i<str.length(); i++)
                if(str.substring(i, i+1).equals(str2.substring(z, z+1)))
                    num++;

            str3 +=""+str2.substring(z,z+1)+num;
        }
        System.out.println(str3);
    }





    // second Way:
    public static void frequencies2(String str) {

        String b=new HashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ","").replace("[","").replace("]","");
        String result="";
        for(int i=0; i<b.length(); i++) {
            int z= Collections.frequency(new ArrayList<>(Arrays.asList(str.split(""))),b.substring(i,i+1));
            result+=""+b.charAt(i)+z;
        }
        System.out.println(result);
    }



    // third way:
    public static void frequencies3(String str) {
        String b=new HashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ","").replace("[","").replace("]","");
        String result="";
        for(int j=0; j<b.length();j++) {
            int times=0;
            for(int i=0; i<str.length(); i++)
                if(str.substring(i, i+1).equals(""+str.charAt(j)))
                    times++;

            result+=b.substring(j,j+1)+times;
        }
        System.out.println(result);
    }




    public static void main(String[] args) {
//        frequencies("javajava");
        frequencies2("javajava");
//        frequencies3("javajava");


        //frequency  for main
        String word = "javajava";
        // need to convert to charArray
        char[] charValue = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charValue) {
            if (map.containsKey(c)) {
                map.put(c, 1 + map.get(c));
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);






    }



}
