package day26_MethodOverloading;

public class MethodOverloading3 {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {


        //20, 30
        sum(10, 20);
        //15.5, 15.5
        sum(1.5, 2.5);

        /*10, 15.5
        sum(10, 15.5);
        double num1 = sum(10, 15.5);
        System.out.println(num1);
         */

        //25L, 30L
        double num2 = sum(25L, 30L);

        //40L, 50L
        sum((int)40L, (int)50L);
        //since we can't assign long number to int we can do explicit casting
        // in order to assign to int

    }

    public static void sum(int a, int b){
        //void method doesn't return any value and will give you a compile error

        System.out.println(a+b);
    }

    /*public static void sum(double a, double b){
        //in method overloading, return type doesn't matter
        System.out.println(a+b);

     */


        public static double sum(double a, double b) {
            return a + b;
            // return type can be the same or different
            //System.out.println(a + b);
    }



}
