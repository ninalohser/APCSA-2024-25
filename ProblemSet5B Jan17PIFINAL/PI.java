
public class PI{
    public static void main (String[] args){
        Fraction MILU = new Fraction( 355, 113 );
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        
        Fraction bestFrac = MILU;
        double bestDiff = EPSILON;
        
        int num = MILU.getNum();
        int denom = MILU.getDenom();
        int count = 0;
        
        while(count < 1000000000){
            Fraction currFrac = new Fraction(num, denom);
            double currDiff = Math.abs(Math.PI - currFrac.toDouble());
            if(currDiff<bestDiff){
                bestFrac = currFrac;
                bestDiff = currDiff;
            }
            if(currFrac.toDouble()<Math.PI){
                num++;
            }else{
                denom++;
            }
            count++;
        }
        System.out.println(bestFrac);
        System.out.println(bestFrac.toDouble());
        System.out.println(bestDiff);
    }
}
