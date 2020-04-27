package day13_StringClass;

import java.util.Scanner;
/*
    2. write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
     */
public class numberToWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 ~ 9");
        int num = input.nextByte();
        String result = "";

        switch(num){
            case 0: result = "Zero";
                break;
            case 1: result = "One";
                break;
            case 2: result = "Two";
                break;
            case 3: result = "Three";
                break;
            case 4: result = "Four";
                break;
            case 5: result = "Five";
                break;
            case 6: result = "Six";
                break;
            case 7: result = "Seven";
                break;
            case 8: result = "Eight";
                break;
            case 9: result = "Nine";
                break;

        }

        System.out.println(result);

        String result2 = (num == 0) ? "Zero"
                : (num == 1) ? "one"
                : (num == 2) ? "two"
                : (num == 3) ? "three"
                : (num == 4) ? "four"
                : (num == 5) ? "five"
                : (num == 6) ? "six"
                : (num == 7) ? "seven"
                : (num == 8) ? "eight"
                : (num == 9) ? "nine"
                : "invalid";

        System.out.println(result2);


    }

}
