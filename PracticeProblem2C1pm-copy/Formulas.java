/**
 * Problem Set 2C
 * Nina Lohser
 * September 26th
 */

class Formulas {
    OrderedPair oPairs = new OrderedPair();
    
    public  String Quadratic(double a, double b, double c){
        double sqroot = Math.sqrt(b*b - 4*a*c);
        
 
        return "" + (  ((-1*b) + sqroot) / (2*a) ) + " and " +  (  ((-1*b) - sqroot) / (2*a) ) +"";
    }
    
    public String FindSlope(double x1, double x2, double y1, double y2){
        
        double slope = (y2 - y1) / (x2-x1);
        return " " + slope;
    
    }


}
