
/**
 * January 7th 2025
 * Nina Lohser
 */
public class FractionDriver{

    public static void main (String [] args){

        Fraction half = new Fraction(1, 2);

        Fraction whole = new Fraction();

        Fraction third = new Fraction("1/3");

        Fraction anotherHalf = new Fraction(half);

        System.out.println("Printing out fractions: ");
        System.out.println("Half: " + half);
        System.out.println("Whole: " +whole);
        System.out.println("Third: " +third);
        System.out.println("Another Half: " +anotherHalf);
        System.out.println(" ");
        
        System.out.println("Accessor methods test: ");
        System.out.println("anotherHalf.getNum(): " + anotherHalf.getNum());
        System.out.println("anotherHalf.getDenom(): " + anotherHalf.getDenom());
        System.out.println("anotherHalf.toDouble(): " + anotherHalf.toDouble());
        System.out.println(" ");
        
        System.out.println("Static methods test: ");
        System.out.println("Addition: half+third: " + Fraction.add(half, third));
        System.out.println("Subtraction: half-third: " + Fraction.sub(half, third));
        System.out.println("Multiplication: half*third: " + Fraction.mult(half, third));
        System.out.println("Division: half/third: " + Fraction.div(half, third));
        System.out.println(" ");
        
        

    }
}
