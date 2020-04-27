package day17_WhileLoops;
/*
3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
 */

public class Finra {

    public static void main(String[] args) {

        String result = "";
        for(int i =1; i <= 30; i++){
            if(i % 3 == 0 && 5 == 0){// prints the numbers that are divisible by BOTH 3 & 5
               // System.out.println("FINRA");
                result += "FINRA";//concatenation
            }else if(i % 3 == 0){// prints the numbers that are ONLY divisible by both 3
              //  System.out.println("FIN");
                result += "FIN";//concatenation
            }else if(i % 5 == 0){// prints the numbers that are ONLY divisible by both 5
              //  System.out.println("RA");
                result += "RA"; //concatenation
            }else {// prints the numbers that are divisible by EITHER 3 & 5
               // System.out.println(i);
                result += i + " ";//concatenation
            }

        }
        System.out.println(result);

    }

}
