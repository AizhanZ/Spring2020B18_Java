package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {
        //System.out.println(9/0);//unchecked exception

        String str = "Cybertek";

        //System.out.println(str.charAt(-1));//OutOfBound exception because index starts from 0

        int[] arr = {1,2,3};
        System.out.println(arr[200]);//the exception occurred during the runtime == unchecked exception

        System.out.println("test completed");
    }

}
