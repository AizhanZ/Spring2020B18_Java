package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    /*
    Arrays.sort(); sorts the array in ascending order
    Arrays.equal(arr1, arr2); arr1 == arr2
    Arrays.toString(); converts single dimensional array to string

    Arrays.deepToString(); converts any dimensional array to string
     */

    public static void main(String[] args) {
        int[] arr = {9,10,8,65,8,6,5};

        Arrays.sort(arr);//[5, 6, 8, 8, 9, 10, 65]

        System.out.println(Arrays.toString(arr));

        int[] salaries = { 100, 3434, 6385, 3000000};
        int length = salaries.length;
        int lastIndex = length-1;

        Arrays.sort(salaries);//ascending

        System.out.println(Arrays.toString(salaries));//[100, 3434, 6385, 3000000]

        System.out.println("minimum salary: " + salaries[0]);
        System.out.println("maximum salary: " + salaries[lastIndex]);//or pass salaries[salaries.length-1]

        System.out.println("=========================================");
        /*
        int[] arr1 = {1,2,3};//1,2,3
        int[] arr2 = {1,2,3};//1,2,3 both will give true

         */
        int[] arr1 = {3,2,1};
        int[] arr2 = {2,1,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));//true





    }
}
