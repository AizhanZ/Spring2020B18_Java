package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {
        //indexOf(Objects) ==> returns the index num
        ArrayList<Character> list1 = new ArrayList<>();
                    list1.add('A');//0
                    list1.add('B');//1
                    list1.add('C');//2
                    list1.add('D');//3
                    list1.add('C');//4
                    //without counting the index number how can find it = by using indexOf

                    int indexnum = list1.indexOf('C');//because it returns number we can assign to int
                    //if it is lower c == will return negative number, which means it doesn't exist
                    int lastIndexNum = list1.lastIndexOf('C');
        System.out.println(indexnum);//2
        System.out.println(lastIndexNum);

        System.out.println(list1);

        Character ch1 = 'C';//just assign to character variable
        //list1.remove('C');//when you pass primitive it gives index number
        //list1.remove(ch1);wll remove the first C

        list1.remove(list1.lastIndexOf('C'));

        System.out.println(list1);

        System.out.println("=============");
        //combining two arrays into list
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11,12,13};

        ArrayList<Integer> list2 = new ArrayList<>();
        //how to store every single element of two arrays in one array = add method
        //how many times I need to add method = 5 times
        //create a loop

        for( int each: arr1 ){//each element of arr1
            //I want to add each to the list
            list2.add(each);
        }
        for( int each: arr2 ){//each element of arr1
            //I want to add each to the list
            list2.add(each);
        }
        System.out.println(list2);

    }

}
