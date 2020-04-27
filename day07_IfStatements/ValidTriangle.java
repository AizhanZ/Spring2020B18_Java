package day07_IfStatements;

public class ValidTriangle {

    public static void main(String[] args) {
/*
Warmup task:
	1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
	Write a program that declares three integers as angles
	and check whether a triangle is valid or not.
	Note : use single if statements
 */
        double angle1 = 30;
        double angle2 = 50;
        double angle3 = 100;

        //short sumOfAngles = angle1 + angle2 + angle3; it gives error because assumes short cannot hold 3 shorts
        short sumOfAngles = (short) (angle1 + angle2 + angle3);
/*
        boolean validTriangle = sumOfAngles == 180;
        if(validTriangle) {
            System.out.println("The shape is a triangle ");
        }
        if(!validTriangle) {
            System.out.println("the shape is not a valid triangle");
        }

*/
        if(sumOfAngles == 180) {
            System.out.println("The shape is a triangle ");
        }
        if(sumOfAngles != 180) {
            System.out.println("the shape is not a valid triangle");
        }
        System.out.println("============================");

    }

}
