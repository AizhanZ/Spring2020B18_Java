package day14_StringClass;

import java.util.Scanner;

public class credentials {
    /*
    userName: cybertek
    passWord: cybertekschool
     */
    public static void main(String[] args) {
        String validUserName = "cybertek";
        String validPassword = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUsername = input.next();

        System.out.println("Enter your password");

        String inputPassword = input.next();

        boolean validCredentials = inputUsername.equals(validUserName) && inputPassword.equals(validPassword);

        if(validCredentials){
            System.out.println("Log in successfully");
        } else {
            System.out.println("Invalid Credentials");
        }
        //if(inputUsername.equals(validUserName) && inputPassword.equals(validPassword)){
        //    System.out.println("Log in successfully");
       // } else {
        //    System.out.println("Invalid Credentials");

       // }



    }
}
