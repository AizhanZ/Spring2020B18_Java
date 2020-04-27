package day21_MultiDimensionalArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class AverageNumber {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        //average: sum of all numbers / length

        int length = arr.length; // total number of the elements
        int sum = 0;//can be double

        for(int i = 0; i < length; i++ ){
            int eachNum = arr[i];//can be double
            sum += eachNum;//sum+=arr[i] also correct
        }

        System.out.println(sum);

        double average = sum/(double)length;//explicit casting

        System.out.println(sum/length);
        /*
        [2,1,3] ==> 6
        [1,2,3] ==> 6
         */
        /*
        int[] arr2 = {1, 2, 2}; //5/3 =

        System.out.println(5/3);
        System.out.println(5/(double)3);

         */

    }

}
