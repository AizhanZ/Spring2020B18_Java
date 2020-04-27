package day22_Arrays_Loops;

import java.util.Arrays;

/*
 2. write a program that sort the array in descending order
 */
public class Descending {

    public static void main(String[] args) {
        //1. sort the array in ascending order
        //2. reverse the array that's sorted in ascending ==> descending


        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr);//sorts in ascending order

        System.out.println(Arrays.toString(arr));//not required to print can run without it

        int[] RevArr = new int[arr.length];

        int j = arr.length-1;
        for(int i = 0; i < arr.length; i++){//can also do i <= arr.length-1
            RevArr[i] = arr[j];
            j--;
        }

        System.out.println(Arrays.toString(RevArr));//Arrays.toString is used to print one dimensional
    }


}
