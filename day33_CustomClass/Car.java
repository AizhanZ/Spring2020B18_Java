package day33_CustomClass;

public class Car {
// i want to create multiple car objects
    String Brand; //don't have to initialise in the beginning
                  //we can initialise them after we create our object
    String model;
    String color;
    int year;

    public void start(){
        System.out.println(Brand + " is started");
    }

    public void drive(){
        System.out.println("Driving " + Brand + " " + model);
    }

    public void getCarInfo(){
        System.out.println(year + " " + Brand + " " + model + " " + color);
    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
    }

    public String toString(){
        String result = year + " " + Brand + " " + model + " " + color;
        return result;
    }

    public static void main(String[] args) {
        int a = 100;//local variable

    }

}
