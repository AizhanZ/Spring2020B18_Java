package day35_Static;

public class staticPractice2 {
    //we give as instance because the brand and model can be different
    String brand;
    String Model;
    static boolean hasWheels = true;

    public void printBrand(){
        System.out.println(brand);//brand instance var cannot be used here directly with static void
    }
    public void printModel(){
        System.out.println(Model);
    }

    public static void main(String[] args) {
        System.out.println(hasWheels);
    }

}
