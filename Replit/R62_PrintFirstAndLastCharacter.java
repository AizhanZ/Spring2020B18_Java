package Replit;

import java.util.Scanner;

public class R62_PrintFirstAndLastCharacter {
//Write a program that will print out first and last letters together
//adobe
//ae
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //Muhtar's code
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);

        System.out.println(firstLetter + " " + lastLetter );
        //Reem's code
        //System.out.println(word.charAt(0) + " " + word.charAt(word.length()-1));
    }

}
