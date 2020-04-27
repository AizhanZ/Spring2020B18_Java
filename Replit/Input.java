package Replit;
/*
write a program that asks the user for his first name and last name.

use a scanner to get the use input.
 */
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();


        /* Muhtar's code
         Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        System.out.println(firstName);
        System.out.println(lastName);
         */

    }
}
