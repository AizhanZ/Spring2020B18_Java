package OfficeHours.Practice_04_22_2020;

import sun.nio.ch.SelectorImpl;

public class void_Method {
/*
declare:
    Access-modifier specifier return-Type methodName(parameter){
        statements;
    }
 */
    public static void main(String[] args) {

        print();

        System.out.println("=========================");

        boolean USCitizen = true;
        int age = 21;

        Vote(age, USCitizen);

        Vote(35, false);

        System.out.println("=========================");
        //28 years old
        EligibleToBuyCig(8);


    }
    public static void print(){
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

    }

    //write a function that can identify if a person in eligible to vote
    //Info we must to know: age, USCitizen

    public static void Vote(int age, boolean USCitizen){
        boolean eligibleToVote = age >= 18 && USCitizen == true;
        if(eligibleToVote){//if this is true
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }
    }

    //write a programme if a person is eligible to buy cigarettes
    //MUST know: age

    public static void EligibleToBuyCig(int age){
        if(age > 18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible to buy");
        }
    }



}
