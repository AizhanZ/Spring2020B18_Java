package Replit;

public class Main {

    public static void main(String[] args) {
        Person Person = new Person();
        //System.out.println(Person);

        Person.setFirstName("John");
        Person.setLastName("Doe");
        Person.setAge(44);

        System.out.println(Person.toString());
    }

}