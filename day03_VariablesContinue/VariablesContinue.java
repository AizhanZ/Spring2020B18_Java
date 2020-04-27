package day03_VariablesContinue;

public class VariablesContinue {
/*
>: greater
		>=: greater or equal
		<: less
		<=: less or equal
		== : equal
		!= : not equal
 */
    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9; //true
        System.out.println(result1);

        System.out.println( true == false );

        System.out.println( "Muhtar" == "Good Guy"); //false - the data is not equal
        System.out.println("Muhtar" != "Good Guy"); //true

        boolean r1 = true != true; //false
        System.out.println(r1); //false

        boolean r2 = "Batch 17" == "Batch 18"; //false

        System.out.println(r2);

        char ch1 = 'A';
        System.out.println(ch1); //A

        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);

        char ch4 = 100; //d
        System.out.println(ch4);

        char ch5 = 'D';
        System.out.println(ch5);//68

        int num1 = 'D'; //will print corresponding number
        System.out.println(num1);


        char a1 = 'z';
        //byte b1 = a1; //char is larger than byte
        byte b1 = 'z';

        //short s1 = a1; //char is larger than short
        int i1 = a1; //int is larger than char


    }

}
