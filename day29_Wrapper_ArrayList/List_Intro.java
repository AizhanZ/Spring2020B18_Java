package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {
        // ArrayList<DataType> listName = new ArrayList <DataType>();

        ArrayList<Integer> scores = new ArrayList<>();//size 0; if I add 5 elements, size 5; remove 3 elements, size 3

        //       mandatory                    optional
        //when you declare array have to specify the size
        //in ArrayList doesn't have to specify, because its dynamic, means changing

        scores.add(10); //autoboxing; size 1
        scores.add(20);//autoboxing; size 2
        scores.add(30);//autoboxing; size 3



        System.out.println(scores);

        Integer a1 = scores.get(2);//will get you the index number, returns as an Integer
        //assigning wrapper class to wrapper class
        int a2 = scores.get(2);
        //assigning wrapper class to primitive - unboxing
        double a3 = scores.get(2);
        //assigning wrapper class to primitive - unboxing

        System.out.println(a1);

        //System.out.println(scores.get(100));//index out of bound

        /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */




    }

}
