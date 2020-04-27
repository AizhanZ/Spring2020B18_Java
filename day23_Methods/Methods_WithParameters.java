package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();

        EligibleToBuyAlcohol(age); // explicit casting
        //by default compiler takes a number as an int so in order to pass byte in the age
        //instead of int you need to use explicit casting ((byte)45)

    }


    public static void EligibleToBuyAlcohol(byte age){

        if(age >= 21){
            System.out.println("Eligible to by alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }


}