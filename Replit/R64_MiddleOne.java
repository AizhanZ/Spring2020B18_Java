package Replit;

import java.util.Scanner;

public class R64_MiddleOne {
    /*
    You have a word, do the following:

            1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
            oak ==> a
            javav ==> v
            - Single character, print that character 3 times
            # ==> ###
            q ==> qqq
            2. When word has even number of characters and:
           - 4 or more characters, print middle 2
           java ==> av
           apples ==> pl
           #$%^&* ==> %^
            - 2 characters, print those 2 characters twice
            @@ ==>@@@@
            $$ ==>$$$$
            hi ==> hihi

     */
    //muhtar's code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length() % 2 != 0) {
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else {
                System.out.println(word.charAt(0) + "" + word.charAt(0) + word.charAt(0));
            }
        } else {
            if (word.length() >= 4) {
                System.out.println(word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2));
            } else {
                System.out.println(word.concat(word));
            }
        }
    }
                 /* someone's code
        int length = word.length();
       int index = length-1;
       boolean odd = length % 2 != 0 && length > 1;
       boolean single = length == 1;
       boolean even = length % 2 == 0 && length > 2;
       boolean twoCh = length == 2;
       String str = "";
       if(odd){
           str = ""+ word.charAt(index/2);
       } else if(single){
           str = word.concat(word).concat(word);
       } else if(even){
           str = ""+ word.charAt(length/2-1) + word.charAt(length/2);
       } else if(twoCh){
           str = word.concat(word);
       }
       System.out.println(str);
         */

//=====================================================================

        /*Reem's code
        if (word.length()%2 != 0){
      if (word.length()>=3){
        System.out.println(word.charAt(word.length()/2));
      }else{
        System.out.println(word.charAt(0)+""+word.charAt(0)+word.charAt(0));
      }
    }else if (word.length()%2 == 0){
      if (word.length()>=4){
        System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2 ));
      }else{
        System.out.println(word.concat(word));
      }
    }
         */
    }
