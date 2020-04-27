package Replit;

import java.util.Scanner;

public class Replit_023 {
    /*
    Write a program that asks user to input int values:
    areaCode and localNumber.

    -Using concatenation put together in this format and assign
    to String phoneNumber  variable:

    -(222)-3334444

    -Write a print statement that displays
    (use phoneNumber variable ):
    Calling number (222)-3334444
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your area code");
        int areaCode = input.nextInt();

        System.out.println("Enter your local number");
        int localNumber = input.nextInt();

        String phoneNumber = "(" + areaCode + ")-" +  localNumber;
        System.out.println("Calling number " + phoneNumber);

    }

}
