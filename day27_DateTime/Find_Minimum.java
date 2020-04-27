package day27_DateTime;
/*
Warmup task:
		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
 */
public class Find_Minimum {
    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 5};//5

        int minimum = arr[0];//first declare a var minimum
        //we put arr[0] because we just assume its 0 and then check by using loop
        //check the index with every single [5,4,7,5}
        //for that we need a loop

        for (int each : arr) {//each: 5,4,7,5
            if (each < minimum) {
                minimum = each;
            }

        }
        System.out.println(minimum);

        int[] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};

        System.out.println(minimum(arr2));

        double[] arr3 = {5.5, 10.5, 1.5, 2.5, 0};
        double num1 = minimum(arr3);

        System.out.println(num1);
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];

        for (int each : arr) {//each: 5,4,7,5
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;

    }

    public static double minimum(double[] arr){
        double minimum = arr[0];

        for (double each : arr) {//each: 5,4,7,5
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}
