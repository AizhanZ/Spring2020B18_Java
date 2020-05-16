package Replit;
import java.util.Scanner;
public class R58_FindTheLength {
/*
Write a program that will output length of the text (string).
Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */

    public static void main(String[] args) {
        //WRITER YOU CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String findLength = input.nextLine();

        System.out.println("Length is: " + findLength.length());
        // System.out.println("Length is: "+text.length()); Muhtar's code

    }
}
