package Replit;

import java.util.Scanner;

public class R59_PrintFirstCharacter {
//Write a program that will print out first character of the word.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        System.out.println(word.charAt(0));
        //Muhtar's code
        //String firstCharacter = word.substring(0,1);
        //System.out.println(firstCharacter);

    }

}
