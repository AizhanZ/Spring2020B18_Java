package day22_Arrays_Loops;

import com.sun.security.auth.UnixNumericGroupPrincipal;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Arrays;

/*
Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement

 */
public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[100]; // index: 0 ~ 99,
        /*
        numbers[0] = 1;
        numbers[1] = 2;
        //.... will continue until we reach 99

         */

        for(int i = 0; i < 100; i++ ){//i <= 99//can use i < numbers.length
            numbers[i] = i+1;//assigning 1 ~ 100
        }

        System.out.println(Arrays.toString(numbers));

        for( int each : numbers){
            if(each % 2 != 0) {
                continue; //if the condition is true we skip (continue)
            }
            System.out.print(each + " ");
        }


    }

}
