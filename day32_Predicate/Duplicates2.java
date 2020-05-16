package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));

        ArrayList<String> result = new ArrayList<>();//the purpose of this array list is to store the
        //duplicated objects into ths list [A, D]
        //in order to I identify if the object is duplicated I need to find the frequency of 1
        //in order to retrieve the first element from the array list by using list.get(0)
        //since frequency is returned as an int we can assign it to int
        //under what condition can I assume that this object is duplicated ==> if it is greater than 0
        //if count > 0 its duplicated
        //if count == 0 it's unique
        //if count > 1 we need add object list.get(0) to ArrayList<String> result = new ArrayList<>();
        //by using result.add(list.get(0))

        /*
        for(String each: list){
            int count = Collections.frequency(list, each );
            if(count > 1 ){
                if(result.contains(each)){
                    continue;
                }
                result.add(each);
            }
        }
        System.out.println(result);
         */


        for(int i=0; i < list.size(); i ++){

            int count = Collections.frequency(list, list.get(i) );
            if(count > 1 && !result.contains(list.get(i))){//if result is already in the list skip it
                result.add(list.get(i));
            }

        }

        System.out.println(result);









    }

}