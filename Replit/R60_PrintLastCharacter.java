package Replit;

import java.util.Scanner;

public class R60_PrintLastCharacter {
//Write a program that will print out last letter of the word (string)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //System.out.println(word.charAt(word.length()-1));//either way is right
        System.out.println(word.substring(word.length()-1));//either way is right

        //Muhtar's code
        // String last=word.substring(word.length()-1);
        // System.out.println(last);
    }

}
