package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,0,20,0,30,0,40,0,0,0));
        System.out.println(list);
        //Arrays is the part of the collections
        int count = Collections.frequency(list, 0);//list can be passed as a collection type, 0 is an object
        //since 0 is an Integer it will be returned as int, that means I can assign it to a variable
        //Collections class has a useful method called frequency
        //if you import Collections class name through which you can call frequency method
        //frequency(CollectionType, Object): returns the frequency of the given object from the given collectionType
        //by int count = Collections.frequency(list, 0) found out the same thing as for loop
        System.out.println(count);

        list.removeAll(Arrays.asList(0));//removes all 0s
        System.out.println(list);

        for(int i =0; i < count; i++ ){
            list.add(0);
        }

        System.out.println(list);

    }
}
