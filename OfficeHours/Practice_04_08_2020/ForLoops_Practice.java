package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {

    public static void main(String[] args) {
        /*
        for(initialization; condition; iterator){ //initialization and condition is mandatory,
        iterator is not but it will give logical error because it needs to check if its false

        }
        iterator: co-related to your condition

        execution order:
            1. initialization
            2. condition
                  if true:
                    statements in the body
                    then iterator

                  if false:
                     stops loop
         */

        for(int i = 0; i <= 5; i++){// i: 0, 1, 2, 3, 4, 5
                                    // i += 2: 0, 3, 5
            //iterator can be placed in the body
            System.out.println("Hello World " + i);
        }

        System.out.println("================================");

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);//1, 2
        }



    }

}
