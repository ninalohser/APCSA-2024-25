
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
        
        System.out.println(half);
        System.out.println(whole);
        System.out.println(third);
        System.out.println(anotherHalf);
        
        System.out.println(anotherHalf.getNum());
        System.out.println(anotherHalf.getDenom());
        System.out.println(anotherHalf.toDouble());
    
    }
}
