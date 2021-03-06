package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(10);
                list1.add(20);
                list1.add(30);
                list1.add(40);

                //if 10,20,60,80,90,100,200,300 if all objects exits in arraylist ==>true
                //otherwise ==> false
        /*
            boolean r1 = list1.contains(10);//it returns boolean
            boolean r2 = list1.contains(20);
            boolean r3 = list1.contains(60);

            boolean result = r1 == true && r2 == true && r3 == true;

        System.out.println(result);
        //contains identifies one object at a time
*/
        boolean result2 = list1.containsAll(Arrays.asList(10,20,60,80,90,100,200,300));
        System.out.println(result2);

        //10, 30, 40
        Integer[] data = {10, 30, 40};
        boolean result3 =  list1.containsAll( Arrays.asList(data)  );
        System.out.println(result3);

        // list1.containsAll( 1,2,3,4,5 );


    }

}
