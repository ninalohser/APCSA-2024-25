
/**
 * Problem Set 2A
 * Nina Lohser
 * September 23rd, 2024
 */

import java.util.Scanner;

public class  Cylinder{

    Scanner input = new Scanner (System.in);

    double radius;
    double height;
    Circle base;
    // ^^instance variable^^

    public Cylinder(){
        // ^^default constructor^^

        height = 1;
        base = new Circle(1);

    }

    public Cylinder(double h, double r){
        // ^^default constructor^^

        height = h;
        base = new Circle(r);

    }

    // Behavior Methods
    public String toString(){
        return "Hello, I am a cylinder with a radius of " + base.getRadius() 
        + "and a height of " + height;

    }

    public double getRadius(){
        return base.getRadius();
    }

    public double getHeight(){
        return height;
    }

    public double surfaceArea(){
        return base.area()*2 + height*base.circumference();
    }

    public double volume(){
        return base.area()*height;
    }

}
/**
 * public String toString()
 * public double getRadius()
 * public double circumference()
 * public double area()
 */