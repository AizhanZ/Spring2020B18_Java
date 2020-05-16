package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {

/*
1. write a program that can return the sum of all the digits from a string
	ex:
		input: "a1b2c3"
		output: 6
			(1+2+3= 6)
		input: "Today's date is 04/27/2020"
		output: 17
			(0+4+2+7+2+0+2+0=17)
	HINT: on ascii table, the characters between #48 ~ #57 are digits
 */

    public static void main(String[] args) {
        String str = "a1b2c3";
        char[] arr = str.toCharArray();
        //use str.toCharArray () to retrieve each character

        System.out.println(Arrays.toString(arr));

        int sum = 0;//we will add every single digit to the sum
        //it will contain the sum of all digits

        for(char each : arr) {
            /*
            //how do we know if the each character is a digit
            //use ASCII table
            boolean isDigit = each >= 48 && each <= 57;
            //if it falls in this range we know it is a digit
            //if each is digit, we will convert to int and add it to sum
            if(isDigit){//can give boolean expression each >= 48 && each <= 57
                //convert the character to number
               sum += Integer.parseInt(each + ""); //"0"
                //whenever the each is digit it will be converted and added to the sum
            }
*/
            if (Character.isDigit(each)){//isDigit(); identifies if the given character is digit
                sum += Integer.parseInt(""+ each);
                //it will identify if the char is digit, will return either true or false
            }
        }
        System.out.println(sum);

        boolean a = Character.isAlphabetic('A');
        //identifies if the character is alphabet

        /*
        assignment task:
        extract the digits and letters from he string
        if its a digit add it to digit string
        if its alphabet add it to alphabet string
         */
    }

}
