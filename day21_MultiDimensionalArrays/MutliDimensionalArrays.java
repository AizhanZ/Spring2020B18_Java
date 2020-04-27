package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class MutliDimensionalArrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3}; //to store multiple data


        int[][] arr2D = { {1,2,3} , {4,5,6,7} };
        //   index number is 0    ,    1

        System.out.println(arr2D.length);

        int[] arr1D = arr2D[0]; //{1,2,3};
        System.out.println(Arrays.toString(arr2D[0]));

        int num1 = arr2D[1] [3];
        System.out.println(num1);
        //                   0   1        0 , 1  , 2         0    1    2
        char [][] ch2D = { {'A','B'} , { 'D', 'E', 'F' } , {'G', 'H', 'I'}};
        //index:               0               1                  2

        char c1 = ch2D[1] [0];
        System.out.println(c1);

        char[] ch2 = ch2D[2]; //{G, H, I};
        System.out.println(Arrays.toString(ch2));

        String [][] str2D = { {"A", "B", "C"} , {"D", "E", "F"} , {"J", "H", "I"} };

        String r1 = str2D[2][1];
        System.out.println(r1);
    }

}
