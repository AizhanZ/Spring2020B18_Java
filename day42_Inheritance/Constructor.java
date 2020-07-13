package day42_Inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class test{
    public test(){
        System.out.println("super class' default constructor");
    }

    //parent constructor cannot call anything from sub class constructor
    //sub class constructor can call super class constructor
}

public class Constructor extends test{

    public Constructor(){

        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
    }
}
