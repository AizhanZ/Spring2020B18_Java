package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {

    public static void main(String[] args) {
        /*
        while(condition){
                statements
        }

        repeated if statement
        execution order:
        1.statement
        2.condition
            if true: repeats step1
            if false: stops the loop

         */

        for(int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }

        System.out.println("=============================");

        int z = 0;
        while(z < 5){
            System.out.println("Hello Cybertek");
            z++;
        }

        int y = 0;
        while(y < 5){
            y++;//executes from 1 to 5
            System.out.println(y);
            //y++; //executes from 0 to 4
        }

        System.out.println("====================");
        /*
        print all the numbers from 0 to 100, that divisible by 15
         */

        int j = 0;
        while(j <= 100){
            if(j % 15 == 0){
                System.out.print(j + " ");
            }
            j++;
        }

    }

}
