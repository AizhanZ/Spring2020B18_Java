package OfficeHours.Practice_05_20_2020;

public class Cat extends Pet{
    /*
    custom class: pet
    variables: name, age, colour, size, breed, isPet, numberOfEyes
    methods: eat sleep, drink, toString, setInfo
     */

    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
        //can use this.name(keyword) but setInfo is shorter
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
