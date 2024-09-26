
/**
 * Problem Set 2B
 * Nina Lohser
 * September 25th 2024
 */

import java.util.Scanner;

class Driver {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
        /**

        System.out.println("lastLetter test cases: ");
        System.out.println("Enter a word with at least one character: " );
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");

        System.out.println("formatPhoneNumber test cases: ");
        System.out.println("Enter a 10 digit number: " );
        String number1 = input.nextLine();
        System.out.println("The number is: " + sTools.formatPhoneNumber(number1));
        System.out.println("---------------------");

        System.out.println("middleThree test cases: ");
        System.out.println("Enter a word with an odd amount of letters: " );
        String middle1 = input.nextLine();
        System.out.println("The middle three digits are: " + sTools.middleThree(middle1));
        System.out.println("---------------------");

        System.out.println("swapLastTwo test cases: ");
        System.out.println("Enter a word with at least two characters: " );
        String lasttwo = input.nextLine();
        System.out.println("Your new word is: " + sTools.swapLastTwo(lasttwo));
        System.out.println("---------------------");

         */

        System.out.println("frontAgain  test cases: ");
        System.out.println("Enter a word with at least two characters: " );
        String word = input.nextLine();
        int n = input.nextInt();
        System.out.println("Your new word is: " + sTools.frontAgain(word , n));
        System.out.println("---------------------");

    }
}
 