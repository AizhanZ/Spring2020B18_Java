package day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {
        /*
        1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
         */

        double numberOfGallons = 5;
        double gallonsToLiters = numberOfGallons * 3.785;
        String result = numberOfGallons + " gallons is equal to: " + gallonsToLiters + " liters";
        System.out.println(result);

        /*
        2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
         */
        double numberOFLitters = 100;
        double littersToGallons = numberOFLitters / 3.785;
        String result2 = numberOFLitters + " litters is equal to: " + littersToGallons + " gallons";

        System.out.println(result2);

        /*
        3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
         */

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //  b = -200 + - 200 * 200 % 2
        //  b = -200 + -40000 % 2
        //  b = -200 + 0
        //  b = -200;

        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x   +   y -  x  *  y  +  x  /  y;
        // z = 300 + 400 - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400         300/400 ==> 0.75 int accepts only whole number
        // z = 300 + 400 - 120000 +
        // z = 700 - 120000

        System.out.println(z);

    }

}
