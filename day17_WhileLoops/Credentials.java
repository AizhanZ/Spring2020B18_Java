package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
/*
        user: cybertek
        pass: cybertek123
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter User name");
        String username  = input.next();

        System.out.println("Enter Pass Word");
        String password  = input.next();

        boolean valid = (username.equals("cybertek") && password.equals("cybertek123") ); // false
        //this boolean expression is validating new username and password

        int count = 1;

        while( ! valid   ){
            // !true
            //while(!(username.equals("cybertek") && password.equals("Cybertek123") ) ){
            System.out.println("Please re enter your credentions");
            System.out.println("Enter User name");
            username  = input.next();
            //String username2 = input.next();//other way to do it

            System.out.println("Enter Pass Word");
            password  = input.next();
            //String password2 = input.next();//other way to do it

            //if(username.equals("cybertek") && password.equals("Cybertek123") ){//cannot use variable in if statement
            //    break;

            valid = (username.equals("cybertek") && password.equals("cybertek123") );  // true
            //this boolean expression is validating new username and password
            count++;

            if(count ==3 && !valid ){
                System.out.println("Your account is locked");
                break;
            }

            if(valid){
                System.out.println("Logged in");
            }

        }






// System.exit(0), break, continue




    }

}

