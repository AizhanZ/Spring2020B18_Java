package day44_Exceptions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Practice {
    /*
    print hello
    wait two seconds
    print Cybertek
    wait three seconds
    Java
     */
    public static void main(String[] args) {
        System.out.println("Hello");

        try{
            Thread.sleep(2000);
        } catch (Exception e){ }
        System.out.println("Cybertek");

        try {
            Thread.sleep(3000);
        } catch (Exception e){ }
        System.out.println("Java");

        try {
            Thread.sleep(4000);
        } catch (Exception e){ }

        System.out.println("completed");
    }


}
