package Replit;

import java.util.Scanner;

public class R69_PrintHalfTwice {
/*
Example:

input: java
output: jaja
 */
//Reem's code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String firstHalf = word.substring(0, word.length()/2);
        System.out.println(firstHalf.concat(firstHalf));
/*
Muhtar's code
if (word.length()%2!=0){
            word = word.substring(0,word.length()/2) + word.substring(0,word.length()/2);
        }else{
            word = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        }

        System.out.println(word);
 */

    }

}
