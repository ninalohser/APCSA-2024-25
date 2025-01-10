
/**
 * January 7th 2025
 * Nina Lohser
 */
public class Fraction{

    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 1;
        denominator = 1;
    }
    
    // ACCESOR METHODS
    public int getNum(){
        return numerator;
    }
    
    public int getDenom(){
        return denominator;
    }
    
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    public double toDouble(){
        return (double)numerator / denominator;
    }

    //CONSTRUCTORS
    public Fraction(int numer, int denom){
        setNum(numer);
        setDenom(denom);
    }

    public Fraction(Fraction f){
        numerator = f.numerator;
        denominator = f.denominator;
    }
    
    public Fraction(String frac){
        
        numerator = Integer.parseInt(frac.substring(0, frac.indexOf("/")));
        if(Integer.parseInt(frac.substring(frac.indexOf("/")+1)) != 0){
            denominator = Integer.parseInt(frac.substring(frac.indexOf("/")+1));
        }else{
            System.out.println("Error: Denominator cannot be zero");
            denominator = 1;
        }
    }
    
    
    
    //MUTATOR METHODS
    public int GCF(){
        while(numerator != denominator){
            if(numerator>denominator){
                numerator -= denominator;
            }else{
                denominator -= numerator;
            }
        }

        return numerator;
        
    }
    
    public void reduce(){
        numerator = numerator / GCF();
        denominator = denominator / GCF();
    }
    
    public void setNum(int numer){
        numerator = numer;        
    }
    
    public void setDenom(int denom){
        if(denom == 0){
            System.out.println("Error: Denominator cannot be zero");
            denom = 1;
        }else{
            denominator = denom;
        }       
    }

    
    // STATIC METHODS
    
    public static Fraction mult(Fraction f1, Fraction f2){
        
        int f1Num = f1.getNum();
        int f1Denom = f1.getDenom();        
        
        int f2Num = f2.getNum();
        int f2Denom = f2.getDenom(); 
        
        Fraction multFrac = new Fraction(f1Num*f2Num, f1Denom*f2Denom);
        
 
        
        return multFrac;
    
    }
    
    public static Fraction div(Fraction f1, Fraction f2){
        
        int f1Num = f1.getNum();
        int f1Denom = f1.getDenom();        
        
        int f2Num = f2.getNum();
        int f2Denom = f2.getDenom(); 
        
        Fraction divFrac = new Fraction(f1Num*f2Denom, f1Denom*f2Num);
        
        
        return divFrac;
    
    }
    
    public static Fraction add(Fraction f1, Fraction f2){
        
        int commonDen = f1.getDenom() * f2.getDenom();
        int f1Num = f1.getNum() * f2.getDenom();
        int f2Num = f2.getNum() * f1.getDenom();
        
        Fraction addFrac = new Fraction(f1Num + f2Num, commonDen);
        

        
        return addFrac;
    
    }
    
    public static Fraction sub(Fraction f1, Fraction f2){
        
        int commonDen = f1.getDenom() * f2.getDenom();
        int f1Num = f1.getNum() * f2.getDenom();
        int f2Num = f2.getNum() * f1.getDenom();
        
        Fraction subFrac = new Fraction(f1Num - f2Num, commonDen);
        

        
        return subFrac;
    
    }
    
    
}
