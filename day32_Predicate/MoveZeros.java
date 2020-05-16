package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        /*
        Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists (the code will be heavily loaded)
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]

         */
        //how can I find frequency of 0 one by one
        //easier way to do it use addAll method
        ArrayList<Integer> list = new ArrayList<>();
                list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 0));//addAll demands collection type but cannot add just 1,0,3..
        // Need to use Arrays.asList() method. Within Arrays.asList parenthesis we pass whatever collection type it demands
        System.out.println(list);
        //without creating any new arraylist we can put in ArrayList<>();
        //in order to find frequency of o need to use loop to compare, how many 0

        //this loop is finding the frequency
        int count = 0; //need a variable for counting
        for(Integer each : list){//each variable : data collection name
            if(each == 0){//each represents every single element in the list, every single element is Integer
                //if each == 0, means 0 is occurred, means I can count it as 1
                count++;//whenever the element matches 0, increase count by 1
            }
        }
        System.out.println(count);//7

        //since I know the frequency of all 0 i will remove all 0, then add them back to the end
        list.removeAll(Arrays.asList(0));//removes all 0s from the ArrayList
        System.out.println(list);//[1,2,3,4]

        //[1,2,3,4,0,0,0,0]
        //list.add(0);//this needs to be repeated as much as the frequency of 0
        //instead of writing them one by one it can be done with loop

        for(int i = 0; i < count; i++){//i<count because count can be 11, 26, any number
            list.add(0);//this is the step that is needed to be repeated
            //will be added to the last index
            //if you want to move all 0s to the beginning of the index list.add(index:0, element:0)
            //if you give index number it will add 0 to the beginning, if don't it will be added to the end
        }
        System.out.println(list);


    }

}
