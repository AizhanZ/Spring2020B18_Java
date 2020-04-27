package day07_IfStatements;

public class MediumNumber {

    public static void main(String[] args) {
        /*
        Warmup Task
        4. write a java program that accepts three numbers and return the median number
				(assume that none of them are equal)
         */
        double a = 100;
        double b = 200;
        double c = 300;
        /*
        a: if (a < b && a > c) or (a > b && a < c) // a could be a median number)
        b: if (b < c && b > a) or (b > c && b < a) // that makes b a median number
        c: if (c < a && c > b) or (c > a && c > b) // that makes c a median number
         */
        boolean aMedium = (a < b && a > c) || (a > b && a < c);
                        // b < a < c or c < a < b
        boolean bMedium = (b < c && b > a) || (b > c && b < a);
                        // c < b < a or a < b < c
        boolean cMedium = (c < a && c > b) || (c > a && c < b);
                        //  a < c < b or b < c < a
        // a > b && a > c ==> a is maximum //
        if(aMedium){
            System.out.println(a + " is the medium number");
        }
        if(bMedium){
            System.out.println(b + " is the medium number");
        }
        if(cMedium){
            System.out.println(c + " is the medium number");
        }



    }

}
