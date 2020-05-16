package day38_Constructors;

public class Circle {
    /*
    Task02:
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
     */

    static double PI = 3.14;
    double radius;
    double diameter;//diameter = radius x 2
    // how much info do i need to initialise - only 1
    // as long as i have radius i can find everything else
    //i need to pass radius in the parameter

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        //it will initialise radius  first and then diameter
    }

    public double area(){
        return PI * radius * radius;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public String toString(){
        return "Circles radius: "+radius+
                ", Circles diameter: "+diameter+
                ", Circles area: "+area()+
                ", Circles perimeter: "+perimeter();
    }

}












