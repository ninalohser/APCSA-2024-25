
/**
 * Write a description of class OrderedPairs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class OrderedPair {
    
    double x, y;
    
    public OrderedPair (double X, double Y){
        x = X;
        y = Y;
    }
    
    public String toString(){
        return "(" + x + "," + y + ")";  
    }
    

    public double getX() {
       
        return x;
    }

    public double getY(){

        return y;
    }
    

}