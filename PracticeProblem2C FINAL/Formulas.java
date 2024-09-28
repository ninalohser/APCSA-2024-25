/**
 * Problem Set 2C
 * Nina Lohser
 * September 26th
 */

class Formulas {
    

    //QUADRATIC FORMULA
    public  String Quadratic(double a, double b, double c){
        double sqroot = Math.sqrt(b*b - 4*a*c);
        return "" + (  ((-1*b) + sqroot) / (2*a) ) + " & " +  (  ((-1*b) - sqroot) / (2*a) ) +"";
    }

    //FIND SLOPE
    public double FindSlope(double y2, double y1, double x2, double x1){
        double slope = ( (y2 - y1) / (x2 - x1) );
        return slope;
    }

    //MIDPOINT FORMULA
    public String FindMidpoint(double Mx1, double Mx2, double My1, double My2){
        double midpointX = ( (Mx1+Mx2)/2 );
        double midpointY = ( (My1+My2)/2 );
        return "(" + midpointX + "," + midpointY + ")";
    }

    //SUM OF ARITHMETIC SERIES
    public double FindSumAri(double Aa, double Ad, int An){
        double sumA =  ((double)An/2) * ((2*Aa) + Ad*(An-1)) ;
        return sumA;
    }

    //SUM OF A GEOMETRIC SERIES
    public double FindSumGeo (double Ga, double Gr, int Gn){
        double sumG = Ga*( (1-Math.pow(Gr, (double)Gn) ) / (1-Gr) );
        return sumG;
    }

    //DIE ROLLER
    public int DieRoller (int limit){
        int min = 1;
        int randomNum = (int) (Math.random()*limit) + min;
        return randomNum;
    }
}
