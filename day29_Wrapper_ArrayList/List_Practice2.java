package day29_Wrapper_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List_Practice2 {
    /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-100);
        list.add(-20);
        list.add(-300);
        list.add(-400);
        list.add(-50);
        list.add(-700);
        list.add(-800);

        //System.out.println(list.size());
        int maximum = Integer.MIN_VALUE; //-2147483648, 100 will be assigned to// the min_value
        //we cannot assign 0 because what if the number is negative
        //any value in the array list will be greater than Integer.Min_Value
        //as soon as its executed will replace it
        //whichever is greater will be assigned to maximum

        //int maximum = list.get(0); //can use this one instead of min_value

        for (int i = 0; i < list.size(); i++) {//i: 0, 1, 2, 3, 4,
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);

        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : list) {
            if (each > maximum2) {
                maximum2 = each;
            }

        }
        System.out.println(maximum2);

        ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(5000);
            list2.add(200);
            list2.add(300);

            int maximum3 = max(list2);//Library.max(list2)
        System.out.println(maximum3);
    }

    private static int max(ArrayList<Integer> list){
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {//i: 0, 1, 2, 3, 4,
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }


}
