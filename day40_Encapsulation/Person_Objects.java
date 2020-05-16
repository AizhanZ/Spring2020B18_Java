package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {
       Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN);

        Zarina.setSSN(1234567);
        System.out.println("Zarina's SSN " + Zarina.getSSN());

        Zarina.setID(8904040);
        System.out.println("Zarina's ID: " + Zarina.getID());
    }

}
