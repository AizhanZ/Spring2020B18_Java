package WarmupTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class GallonsToLiters {

    public static void main(String[] args) {

        int gallons = 10;
        double liters = gallons / 3.78541;

        System.out.println(gallons + " gallons = " + liters + " liters");
    }

}
