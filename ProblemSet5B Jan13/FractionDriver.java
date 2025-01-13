
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

        Fraction answer = new Fraction();

        while(!(response.equals("quit"))){
            Fraction f1 = new Fraction((int)(Math.random() * 7) +1, (int)(Math.random() * 7) +1);
            f1.reduce();
            Fraction f2 = new Fraction((int)(Math.random() * 7) +1, (int)(Math.random() * 7) +1);
            f2.reduce();

            int symbol = (int)(Math.random() * 3) + 1;
            String operator = "";
            if(symbol == 1){
                operator = "+";
                answer = Fraction.add(f1, f2);
            }else if(symbol == 2){
                operator = "-";
                answer = Fraction.sub(f1, f2);
            }else if(symbol == 3){
                operator = "*";
                answer = Fraction.mult(f1, f2);
            }else if(symbol == 4){
                operator = "/";
                answer = Fraction.div(f1, f2);
            }

            System.out.print(f1 + " " + operator + " " + f2 + "= ");
            response = input.nextLine();

            if(!(response.equals(answer.toString()))){
                System.out.println("Wrong, the answer was " + answer);
            }else{
                System.out.println("Correct");
            }

            //if(response.equals){
            //}

        }
    }
}