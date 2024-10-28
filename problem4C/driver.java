package problem4C;


/**
 * Write a description of class driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class driver{
    public static void main(String [] args){
        Review r = new Review();
        Scanner input = new Scanner (System.in);
        int x = 10;
        while (x>0){
    
            System.out.println(r.totalSentiment("SimpleReview.txt"));
        }
        
        
    }

}
