
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
        OrderedPair o = new OrderedPair();
        

        //QUADRATIC FORMULA
        System.out.println("Quadratic Formula ( ax^2 + bx + c = 0 ): ");
        System.out.println("-------------------------------------------");
        System.out.print("Insert value of A: ");
        double a = input.nextDouble();
        System.out.print("Insert value of B: ");
        double b = input.nextDouble();
        System.out.print("Insert value of C: ");
        double c = input.nextDouble();
        System.out.println("The solutions for " +(int)a+"x^2 + "+(int)b+"x + "+(int)c+" are: " + f.Quadratic(a,b,c));
        System.out.println("");
        System.out.println("");

        //FIND SLOPE
        System.out.println("Find Slope: ");
        System.out.println("-------------------------------------------");
        System.out.println("Insert the coordinates of the first point: ");
        System.out.print("x1 = ");
        double x1 = input.nextDouble();
        System.out.print("y1 = ");
        double y1 = input.nextDouble();
        System.out.println("Insert the coordinates of the second point: ");
        System.out.print("x2 = ");
        double x2 = input.nextDouble();
        System.out.print("y2 = ");
        double y2 = input.nextDouble();
        System.out.println("A line between " + o.FSlope(x1, y1, x2, y2) + " has a slope of " + f.FindSlope(y2, y1, x2, x1));
        System.out.println("");
        System.out.println("");

        //MIDPOINT FORMULA
        System.out.println("Midpoint: ");
        System.out.println("-------------------------------------------");
        System.out.println("Insert the coordinates of the first point:");
        System.out.print("x1 = ");
        double Mx1 = input.nextDouble();
        System.out.print("y1 = ");
        double My1 = input.nextDouble();
        System.out.println("Insert the coordinates of the second point: ");
        System.out.print("x2 = ");
        double Mx2 = input.nextDouble();
        System.out.print("y2 = ");
        double My2 = input.nextDouble();
        System.out.println("The midpoint between the points " + o.Mid(Mx1, My1, Mx2, My2) + " is " + f.FindMidpoint(Mx1, Mx2, My1, My2));
        System.out.println("");
        System.out.println("");

        //SUM OF ARITHMETIC SERIES
        System.out.println("Sum of Arithmetic Series: ");
        System.out.println("-------------------------------------------");
        System.out.println("Insert the first term of the equation:");
        System.out.print("a = ");
        double Aa = input.nextDouble();
        System.out.println("Insert the difference between each term: ");
        System.out.print("d = ");
        double Ad = input.nextDouble();
        System.out.println("Insert the number of terms in the equation:");
        System.out.print("n = ");
        int An = input.nextInt();
        System.out.println("The sum of the first " + An + " terms of an arithmetic series that starts with " + Aa + " and increases by "
        + Ad + " is " + f.FindSumAri(Aa, Ad, An));
        System.out.println("");
        System.out.println("");

        //SUM OF A GEOMETRIC SERIES
        System.out.println("Sum of Geometric Series: ");
        System.out.println("-------------------------------------------");
        System.out.println("Insert the first term of the equation:");
        System.out.print("a = ");
        double Ga = input.nextDouble();
        System.out.println("Insert the ratio between each term: ");
        System.out.print("r = ");
        double Gr = input.nextDouble();
        System.out.println("Insert the number of terms in the equation:");
        System.out.print("n = ");
        int Gn = input.nextInt();
        System.out.println("The sum of the first " + Gn + " terms of a finite geometric sequence that starts with "
        + Ga + " and increases by a ratio of " + Gr + " is "+ f.FindSumGeo(Ga, Gr, Gn));
        System.out.println("");
        System.out.println("");

        //DIE ROLLER
        System.out.println("Die Roller: ");
        System.out.println("-------------------------------------------");
        System.out.print("Insert number of sides on the dice: ");
        int limit = input.nextInt();
        System.out.println("The " + limit + " sided die rolled a : " + f.DieRoller(limit));
        System.out.println("");
        System.out.println("");

    }
}
