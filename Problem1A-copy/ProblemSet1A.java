
/**
 * Problem set 1A - Question 1
 * Nina Lohser
 * September 9th, 2024
 */

import java.util.Scanner;

public class ProblemSet1A{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your favourite class? ");
        String course = input.nextLine();
        
        System.out.print("What pet do you have? ");
        String pets = input.nextLine();
        
        System.out.print("Where were you born? ");
        String placeofbirth = input.nextLine();
        
        System.out.print("What year were you born? ");
        int yearofbirth = input.nextInt();
        
        System.out.println("Summary: ");
        System.out.print(" You really enjoy "+ course); 
        System.out.print(", and you have a "+ pets);
        System.out.print(".");
        System.out.println(" You were born in " + placeofbirth);
        System.out.print(", in "+ yearofbirth);
        System.out.print (", which makes you " + (2024-yearofbirth));
        
    }
}