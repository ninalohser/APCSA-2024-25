
/**
 * Problem Set 2A
 * Nina Lohser
 * September 23rd, 2024
 */

import java.util.Scanner;

public class  Circle{

    Scanner input = new Scanner (System.in);

    double radius;
    // ^^instance variable^^

    public Circle(){
        // ^^default constructor^^

        radius = 1;

    }

    public Circle(double r){
        // ^^default constructor^^

        radius = r;

    }
    
    // Behavior Methods
    public String toString(){
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double circumference(){
        return (radius*2*Math.PI);
    }
    
      public double area(){
        return (radius*radius*Math.PI);
    }


}
/**
 * public String toString()
 * public double getRadius()
 * public double circumference()
 * public double area()
 */