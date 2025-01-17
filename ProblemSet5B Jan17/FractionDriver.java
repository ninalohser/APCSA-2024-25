
/**
 * January 7th 2025
 * Nina Lohser
 */
import java.util.Scanner;
public class FractionDriver{

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        String response = "";

        String operator = "";

        int winCount = 0;
        int loseCount = 0;

        Fraction answer = new Fraction();

        while(!(response.equals("quit"))){
            Fraction f1 = new Fraction((int)(Math.random() * 7) +1, (int)(Math.random() * 7) +1);
            f1.reduce();
            Fraction f2 = new Fraction((int)(Math.random() * 7) +1, (int)(Math.random() * 7) +1);
            f2.reduce();

            operator = Fraction.Operator(operator);
            System.out.print(f1 + " " + operator + " " + f2 + "= ");
            response = input.nextLine();
            answer = Fraction.calculate(operator, f1, f2);

            if(response.equals("quit")){
                System.out.println("Your win to lose ratio is " + winCount + ":" + loseCount);
                break;
            }

            if(!(response.equals(answer.toString( )))){
                System.out.println("Wrong, the answer was " + answer);
                loseCount++;
            }else if(response.equals(answer.toString())){
                System.out.println("Correct!");
                winCount++;
            }

        }
   
    }
}