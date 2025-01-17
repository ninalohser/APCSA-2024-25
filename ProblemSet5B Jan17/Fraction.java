
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
    public int GCF(int a, int b){
        while(a != b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }

        return a;

    }

    public void reduce(){
        int gcf = GCF(numerator, denominator);
        if(numerator != gcf){
            numerator = numerator / gcf;
        }

        if(denominator != gcf){
            denominator = denominator / gcf;
        }
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

        multFrac.reduce();

        return multFrac;

    }

    public static Fraction div(Fraction f1, Fraction f2){

        int f1Num = f1.getNum();
        int f1Denom = f1.getDenom();        

        int f2Num = f2.getNum();
        int f2Denom = f2.getDenom(); 

        Fraction divFrac = new Fraction(f1Num*f2Denom, f1Denom*f2Num);

        divFrac.reduce();

        return divFrac;

    }

    public static Fraction add(Fraction f1, Fraction f2){

        int commonDen = f1.getDenom() * f2.getDenom();
        int f1Num = f1.getNum() * f2.getDenom();
        int f2Num = f2.getNum() * f1.getDenom();

        Fraction addFrac = new Fraction(f1Num + f2Num, commonDen);

        addFrac.reduce();

        return addFrac;

    }

    public static Fraction sub(Fraction f1, Fraction f2){

        int commonDen = f1.getDenom() * f2.getDenom();
        int f1Num = f1.getNum() * f2.getDenom();
        int f2Num = f2.getNum() * f1.getDenom();

        Fraction subFrac = new Fraction(f1Num - f2Num, commonDen);

        subFrac.reduce();

        return subFrac;

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String Operator(String operator){
        int symbol = (int)(Math.random() * 3) + 1;

        if(symbol == 1){
            operator = "+";
        }else if(symbol == 2){
            operator = "-";
        }else if(symbol == 3){
            operator = "*";
        }else if(symbol == 4){
            operator = "/";
        }
        return operator;
    }

    public static Fraction calculate(String operator, Fraction f1, Fraction f2){
        if(operator.equals("+")){
            return Fraction.add(f1, f2);
        }else if(operator.equals("-")){
            return Fraction.sub(f1, f2);
        }else if(operator.equals("*")){
            return Fraction.mult(f1, f2);
        }else if(operator.equals("/")){
            return Fraction.div(f1, f2);
        }
        
        return f1;
    }

}

