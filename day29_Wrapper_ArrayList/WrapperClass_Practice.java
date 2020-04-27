package day29_Wrapper_ArrayList;

import java.util.Arrays;

/*
Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find thhe maximum and minimum numbers
		NOTE: Do not use sort method
 */
public class WrapperClass_Practice {

    public static void main(String[] args) {

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max = Double.MIN_VALUE; //1 is max currently,
        // after second execution of the loop it will be replaced to 2.5
        //any number in this array is greater than .min_value
        //its a temporary variable

        for(String each : arr){//will be executed 5 times
            //each value: 1, 2.5, 3, 3.5, 4.5
            double num = Double.parseDouble(each);//can be used with valueOf

            if(num > max){
                max = num;

            }

        }
        System.out.println(max);

        System.out.println("===========================");

        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};

        double[] numbers = new double[arr2.length];
        //                  [0.0, 0.0, 0.0, 0.0, 0.0]
        //we want to store  [1,   2.5,  3,  3.5, 4.5

        for(int i=0; i < arr2.length; i++) {

            numbers[i] = Double.parseDouble(arr2[i]);
            //convert this string and assign to the index for numbers[0]
            //we need to repeat it 5 times that's why we need apply loop
            //since we are repeting we can pass i instead of 0
        }

        //System.out.println(Arrays.toString(numbers));

        //sorting
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]);



    }

}
