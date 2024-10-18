
/**
 * Problem Set 4A
 * Oct 18th 2024
 * Nina Lohser
 */

import java.util.Scanner;

public class Question1{

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int number = (int)(Math.random()*100 +1);
        System.out.print("I'm thinking of a number between 1 and 100. Can you guess it?");
        int response = input.nextInt();
        int tries = 0;

        while(response!=number){
            if(response>number){
                System.out.println("Your guess: " + response);
                System.out.println("Nope, that guess is too high.");
                tries++;
            }else {
                System.out.println("Your guess: " + response);
                System.out.println("Nope, that guess is too low.");
                tries++;
            }
            System.out.println("Guess again! ");
            response = input.nextInt();
        }
        System.out.println("You guessed it! It took you "+tries+" tries.");
    
    }

}

