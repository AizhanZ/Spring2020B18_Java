package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {

    /*
    1. write a program that can remove all the special characters from a list of Character
    2. write a program that can remove all the numbers that can divisble by 3 or 5 in arrayList
     */


    public static void main(String[] args) {
        //5, 9, 10 11

        //5
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Robb", "Bran", "Rick", "Bran"));
        //  0        1       2       3
                                        //in if statement need to pass boolean expression
        if( names.remove("Bran") ){ // {Robb", "Rick", "Bran"};//names.remove("Bran") is compiling because
                                       // if you pass an object in the remove statement it will return boolean
            names.remove("John");  //{Robb", "Rick", "Bran"};
                        //if there was a number 5 in the remove statement it will give Out of Bound because
                        //Rob, Rick, Bran are only 3 indexes
        }

        System.out.println(names);

        //9
        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1,2,3,4,5));  // { 1, 2, 3, 4, 5}

        // { 1, 2, 3, 4, 5}

        numbers.set(0,  numbers.get(4) );  //{5, 2, 3, 4, 5} replace 1 with 5
        // set(0, 5)

        //{5, 2, 3, 4, 5}
        numbers.set(4, numbers.get(0)) ; // {5, 2, 3, 4, 5}
        // set(4, 5)

        System.out.println(numbers);

        System.out.println("=========================");
        // 11
        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7));
        //{1,2,3,4,5,6,7}

        for(Integer each: nums){ // each: 1,2,3,4,5,6,7
            if(each % 2 != 0){
                continue;
            }

            System.out.print(each+" "); // 2
            break;

        }



    }


}
