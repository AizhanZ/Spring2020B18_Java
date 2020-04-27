package day16_ForLoop;
/*
1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
 */
public class DivisibleBy3_5 {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){ // +=2

            if(i % 2 !=0 ){ //if want to print out even numbers (i % 2 == 0 )

                if(i % 3 == 0 && i % 5 == 0){//if want to check if its divisible by 3 and 5
                    System.out.print(i + " "); // if want on the same line use print instead of println
                }

            }

        }

    }

}
