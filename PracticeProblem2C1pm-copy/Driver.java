
/**
 * Problem Set 2C
 * Nina Lohser
 * September 26th
 */

import java.util.Scanner;

class Driver {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        
        Formulas f = new Formulas();
        
        System.out.println("Quadratic Formula - ( ax^2 + bx + c = 0 )");
        System.out.print("Insert value of A");
        double a = input.nextDouble();
        System.out.print("Insert value of B");
        double b = input.nextDouble();
        System.out.print("Insert value of C");
        double c = input.nextDouble();
        System.out.println("The roots of this equation are: " + f.Quadratic(a,b,c));
        System.out.println("-------------------------------------------------------");
        
        
        
        System.out.println("Find Slope ");
        System.out.print("Insert the coordinates of the first point");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Insert the coordinates of the second point");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
   
        System.out.println("The slope of this equation is: " + f.FindSlope(x1, y1, x2, y2));
        
        System.out.println("-------------------------------------------------------");
        
        
    }

}
