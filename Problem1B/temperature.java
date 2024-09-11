
/**
 * Celsius to Fahrenheit
 * Sept 11th
 * Nina Lohser
 * Q1
 */

import java.util.Scanner;

public class temperature{

    public static void main (String [] args) {

        /** temperature
         *  
         */

        Scanner input = new Scanner (System.in);
        System.out.println("*** Celsius --> Fahrenheit ***");
        System.out.print("Input a temperature in Celsius:");
        double Celsius = input.nextDouble();

        System.out.println(Celsius + " Celsius = " + "Fahrenheit = " + ((Celsius * 9/5)+32));

        System.out.println("    ");

        /** BMI
         */

        System.out.println("*** BMI Calculator ***");

        System.out.print("Enter a weight in kgs: ");
        double Weight = input.nextDouble();
        System.out.print("Enter a height in m: ");
        double Height = input.nextDouble();

        System.out.println("BMI = "+ (Weight/Height/Height));
        
        System.out.println("     ");

        /** Days to weeks/days
         */

        System.out.println("*** Days --> Weeks and Days ***");

        System.out.println("Enter a number of days : ");
        int Days = input.nextInt();

        System.out.println(Days + " days is equal to " + (Days/7) + " weeks and "+ (Days % 7) + " days" );
        
        System.out.println("     ");
        
        
        /** Reciept Generator
         */

        System.out.println("*** Reciept Generator ***");

        System.out.println("Number of units you are buying: ");
        int Units = input.nextInt();
         System.out.println("Price per unit: ");
        double Price = input.nextDouble();
         System.out.println("Tax rate: ");
        double Tax = input.nextDouble();
        
        double Total = Units*Price;
        double TotalTax = Units*Price*Tax/100;

        System.out.println("Purchasing " + Units + " units at $" + Price + " with " + Tax + "% tax will cost " + (TotalTax+Total));
        
        System.out.println("     ");
        
        
        /** Reciept Generator
         */

        System.out.println("*** Sum of Digits ***");

        System.out.println("Enter a positive, 3 digit number: ");
        int Number = input.nextInt();
        int First = Number % 10;
        int First = Number % 10;
        

        System.out.println("The sum of the digits of the number " + Number + " is = ");
        
        System.out.println("     ");
    }
}

