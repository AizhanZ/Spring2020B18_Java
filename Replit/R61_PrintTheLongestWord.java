package Replit;

import java.util.Scanner;

public class R61_PrintTheLongestWord {
//Write a program that will print out last letter of the word (string).
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        // Muhtar's code
        if(word1.length() > word2.length()){
        System.out.println(word1);
        }else{
        System.out.println(word2);
        }
    }
}
