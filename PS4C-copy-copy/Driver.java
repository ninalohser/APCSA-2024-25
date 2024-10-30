
/** Problem Set 4C
 * Nina Lohser
*/


import java.util.Scanner;


class Driver{
    
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Review1 Value: "+ Review.totalSentiment("SimpleReview.txt"));
        System.out.println("Star1 rating: " + Review.starRating("SimpleReview.txt"));
        System.out.println("");
        System.out.println("Review1 Value: "+ Review.totalSentiment("PosReview2.txt"));
        System.out.println("Star1 rating: " + Review.starRating("PosReview2.txt"));
        System.out.println("");
        System.out.println("Review1 Value: "+ Review.totalSentiment("MixedReview3.txt"));
        System.out.println("Star1 rating: " + Review.starRating("MixedReview3.txt"));
    }
    
}