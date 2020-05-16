package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {

    /*
    write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]
     */


    public static void main(String[] args) {
        /*
        in order to decide which element is duplicated the following approach needs to be taken
        - finding the frequency of each element, otherwise without knowing it I don't know if it's duplicated or not
        - to find out if the element "A" is duplicated or not need to find the frequency of element at index 0
        - to retrieve the element of index 0 at ArrayList, by giving the index number
        - list.get(0) will retrieve the first element from the list, which is "A"
        - in order to find it I have to check it with every single element one by one
        - declare variable int count = it's gonna count how many times this variable is occured in the list
        - then need loop to compare with every element
        int count = 0;
        for(String each: list){//this loop will iterate enough times to check every element
            if( each.equals( list.get(i) )  ){//each is a string and list is also a string
            //each.equals to the element we are comparing (list.get(i))

                count++; if the code above occurs the count will be increased by 1

                //to find out how many times list.get(0)  ==> "A" occurs - we apply (each.equals( list.get(i) )
                //(each == 0) is the same approach
                if I give list.get(0) index 0 it will return the first index
                if the frequency of index is greater than 1 then it means it is duplicated,
                if it's duplicated I want to print it out or put it into another list
                int count = 0;
                for(String each: list){
                if( each.equals( list.get(i) )  ){
                count++;

                create another list duplicates - ArrayList<String> duplicates = new ArrayList<>();
                the purpose of creating this list is to put all the duplicated characters from this list
                ("A", "B", "A", "C", "D", "D") to duplicates list
                in list.get(0) if 0 is duplicated it needs to be in the duplicated list by doing the following condition
                if(count > 1) the count is counting the frequency of list.get(0) then this is the element I need to add
                the duplicates list
                from duplicates.add(list.get(0)) count is the frequency of list.get element

                this step needs to be repeated to all elements and every time it needs to be a different index
                int count = 0;
                for(String each: list){
                if( each.equals( list.get(i) )  ){
                    count++;
                }
            }
            that's why we need another loop
            for(int i =0; i < list.size(); i++){this loop will be executed 5 times
            that's why this we need to put inside of this loop
            int count = 0;
            for(String each: list){
                if( each.equals( list.get(i) )  ){//need to change index from 0 to i in order to find frequency of
                different elements of the list
                    count++;
                }
            }
            the output of sout(duplicates) will be [A, A] but the output should be only one "A"
            this is a condition if the object is already in the list don't add
            if(count >1 && !duplicates.contains(list.get(i) ) )




  */


        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();


        for(int i =0; i < list.size(); i++){

            int count = 0;
            for(String each: list){
                if( each.equals( list.get(i) )  ){
                    count++;
                }
            }

            if(count >1 && !duplicates.contains(list.get(i) ) ){
                // if the frequency is greater than one , and if it's not contained in duplicates yet, then we will add the object to the duplicates
                duplicates.add(  list.get(i)  );

            }

        }

        System.out.println(duplicates);


/*
        //list.get(0)  ==> "A" returns first element from list
        int count = 0;
        for(String each: list){
            if( each.equals( list.get(i) )  ){
                count++;
            }
        }
        if(count >1){
            duplicates.add(  list.get(i)  );
        }
  */




    }

}