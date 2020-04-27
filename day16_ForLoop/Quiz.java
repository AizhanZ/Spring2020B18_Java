package day16_ForLoop;

import java.sql.SQLOutput;

public class Quiz {
    public static void main(String[] args) {
        int i = 0;
        for(i = 5; i < 10;){//i = 11
            i+=2;//this is iteration; iteration is not mandatory to give in paranthesis
        }
        System.out.println(i);

        String str = " ";
        System.out.println(str.trim());

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

    }
}
