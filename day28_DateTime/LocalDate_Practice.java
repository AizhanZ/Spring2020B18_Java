package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
/*
Warm up task
1. create an array of string, store name of your three friends in it
2. create an array of localDates and store their birthdays in the same order
3. use for loop to print out your friends' names and their birthdays
 */
    public static void main(String[] args) {

    String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirtday = LocalDate.of(2010, 5, 6);
        /*
        int a = 100;
        int b = 200;
        int c = 300;
        //can store multiple values in the same variable --> array
        int[] array1 = {a, b, c};

         */

        LocalDate[] birthdays = {JohnBirthday, AaronBirthday, DanielBirtday};
        //whatever variable you store in array must match the data type

        //How to iterate friends and birthdays ot print out names and birthdays
        //can use for loop, cannot use for each loop because there are two different data location
        for(int i = 0; i < friends.length; i++){
            //how can you retrieve each string array friends and localdate
            String name =  friends[i];
            LocalDate bd = birthdays[i];
            System.out.println(name + "'s birthday is " + bd);
        }




    }

}
