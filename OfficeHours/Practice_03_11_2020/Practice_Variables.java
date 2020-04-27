package OfficeHours.Practice_03_11_2020;

public class Practice_Variables {

    public static void main(String[] args) {

        /*
        brand
        year
        price
        model
        maximumMiles
         */
        String brand = "BMW";

        System.out.println(brand);
        System.out.println("brand");
        short year = 2020;
        float price = 50000.50F;
        String model = "X6";
        short maximumMiles = 32767;

        System.out.println(9 + 10); //19
        System.out.println("9" + "10"); //910
        System.out.println("9" + 10); //910

        System.out.println("Car brand = ");

        //variables that declared in a block, must be initialized before use
        System.out.println("The vehicle " + year + " " + brand + " " + model + ", " + "has " + maximumMiles + ", " + "price is " + price + " dollars");

    }

}
