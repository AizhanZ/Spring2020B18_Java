package OfficeHours.Practice_05_20_2020;

public class Pet {
    /*
    custom class: pet
    variables: name, age, colour, size, breed, isPet, numberOfEyes
    methods: eat sleep, drink, toString, setInfo
     */

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;

    protected static boolean isPet= true;
    protected static int numberOfEyes = 2;
    //constructor will not be inherited

    public void setInfo(String name,int age,String color,String size,String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
        this.breed = breed;
    }

    public void eat(String food){//can't add static because its instance and cannot accept static
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(String place){
        System.out.println(name+" is sleeping on the "+place);
    }

    public String toString(){
        return "name "+name+", age "+age+",  color "+color+", size "+size+", breed "+breed;
    }


}
