package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name  = "Java";//'J','a','v','a'

        char[] chars = name.toCharArray();//4

        System.out.println(chars[0]);//'J'
        System.out.println(chars[3]);//'a'

        //System.out.println(chars[4]);

        String str = "I like Java";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));
        /*
        reverse sentence: day great is today

         */
        String sentence = "Today is great day";
         String[] words = sentence.split(" ");

       System.out.println(Arrays.toString(words));
       String result = "";

       for(int i = words.length-1; i >= 0; i--){
           String eachWords = words[i];
           //System.out.print(eachWords + " ");//or pass words[i]
            result += eachWords + " ";
       }
        System.out.println(result);

       //how to
       String str2 = "ABCD";
       String arr2[] = str2.split("");       //["A", "B", "C", "D"]
        char[] ch2 = str2.toCharArray();//returns char['A', 'B', 'C', 'D']

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));

    }

}
