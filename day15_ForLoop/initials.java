package day15_ForLoop;
/*
warmup tasks:
	1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */

import java.util.Scanner;

public class initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
           String firstName = scan.next();

        System.out.println("Enter your last name");
            String lastName = scan.next();

            /*
            String initials = firstName.substring(0, 1) + lastName.substring(0, 1);
                initials = initials.toUpperCase(); easy way to do it
           // String initials = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase(); this one is too long but can do it

            */

            //another way to do it with charAt()
        String initials = "" + firstName.charAt(0) + lastName.charAt(0);//if you concate to a string "" it will make the who line string otherwise it will add two chars as numbers

            initials = initials.toUpperCase();
        System.out.println(initials);


    }

}
