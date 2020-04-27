package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // Implicit casting: done automatically (casting smaller primitives to larger primitives)
        int a = 10;
        long b = a; // implicit casting is done automatically
            // b = 10L;

        // int c = b; // b is still long datatype

        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting


       // int c1 = b1; compile error because long is larger


        //Explicit casting: casting larger primitives to smaller primitives

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short)Inum;

        double Dnum = 5.5;

        // float Fnum = (float)Dnum; // 5.5
        float Fnum = (int) Dnum; // 5.0

        System.out.println(Fnum + 1);

        double D1 = 10.5;
        // long L1 = (long) ( (float)D1)
        long L1 = (int)D1;
        System.out.println(L1); //10

        float F1 = 60.5f;
        int I1 = (int)F1; // preferred
        System.out.println(I1);

        long largeNum = 9999999999999L;

        int intNum = (int) largeNum;
        System.out.println(intNum);
            // it gives a different num because 99999999 is out of int's range

        char ch1 = 'a';

        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2 = 23456;

        double dbl1 = ch2; // prints out decimal

        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1; // 10.0

        short y1 = (short)z1;




    }

}
