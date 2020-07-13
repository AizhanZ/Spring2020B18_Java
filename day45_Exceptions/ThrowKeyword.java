package day45_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword {
/*
    public static void method1() throws Exception{
        Thread.sleep(3000);
    }

    public static void main(String[] args)  {

        //  method1();

        //  Thread.sleep(1000);

    }
 */

    public static void main(String[] args) {

        NoSuchElementException obj = new NoSuchElementException();

        //throw obj;
        throw new NoSuchElementException();//use only manually




    }


}