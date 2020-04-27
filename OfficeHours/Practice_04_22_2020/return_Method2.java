package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {
//write a return method that can return the second maximum from an int array
    public static void main(String[] args) {

        int[] arr = {100, 40, 500, 50, 30, 100, -5, -100};

        Arrays.sort(arr);//static specifier - we call from the class name
        //the easiest way, will be sorted in ascending order
        //toString is overloaded method because with the same method you can overload
        //different types of array. It can be applied to any data parameter

        System.out.println(Arrays.toString(arr ));
        //because its static that's why you can call it through the class
        //toString is also overloaded because you can use with different data types


        int lastIndexNum = arr.length-1;//we assign arr.length-1 to find last index number
        int secondLastIndexNum = lastIndexNum -1;//arr.length -2 is the same thing
        //                      arr.length-1-1 == arr.length -2 is the same length
        int secondMaximum = arr[secondLastIndexNum];//can also pass arr.length -2

        System.out.println(secondMaximum);

        int[] arr2 = {1,2,3,4,5,6,7,8};

        int num2 = secondMax(arr2);

        System.out.println(num2);

    }

    public static int secondMax(int[] arr){//we need extra info so we provide a parameter from above
        //is a method to retrieve a second max num from int array

        //we copy the above info and place in method's body
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr ));
        int lastIndexNum = arr.length-1;
        int secondLastIndexNum = lastIndexNum -1;//arr.length -2 is the same thing
        //                      arr.length-1-1 == arr.length -2
        int secondMaximum = arr[secondLastIndexNum];

        //System.out.println(secondMaximum);

        return secondMaximum;//we use return to reuse it later
        //if you use print it will not be reusable
        //you cannot return two values in one method
    }


}
