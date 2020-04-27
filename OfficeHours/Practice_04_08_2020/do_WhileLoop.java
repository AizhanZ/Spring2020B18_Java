package OfficeHours.Practice_04_08_2020;

public class do_WhileLoop {

    public static void main(String[] args) {
        /*
        do{
               statement;
        }while(condition);
       execution order:
       1. statement;
       2. condition;
            if true: repeats step1
            if false: stops the loop
         */

        boolean b = false;
        while(b){
            System.out.println("Hello");
        }
        System.out.println("===============================");

        do{
            System.out.println("Hello Cybertek");
        }while(b);

        System.out.println("===============================");
/*
find if numbers 0 to 100 divisible by 15 do while loop
 */
        int j = 0;
        do {
            if (j % 15 == 0) {
            System.out.print(j + " ");
        }


            j++;
        }while(j <= 100);

    }

}
