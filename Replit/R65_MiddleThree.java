package Replit;

import java.util.Scanner;

public class R65_MiddleThree {
    /*
    You have a word, do the following:

    If the word has odd number of characters
    and has 5 or more characters, print the middle three
    characters of the word.

    Otherwise print "invalid".
    fifteen ==> fte
    apple ==> ppl
    hey ==> invalid
    java ==> invalid
    whatsup ==> ats
    $ ==> invalid
     */
    //Muhtar's code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();
        String middleThree = " ";

        if (length >= 5 && length % 2 != 0) {
            middleThree += word.substring(length / 2 - 1, length / 2 + 2);
            System.out.println(middleThree.trim());
        } else {
            System.out.println("invalid");
        }


    }
}