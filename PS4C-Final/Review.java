import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

    private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
    private static ArrayList<String> posAdjectives = new ArrayList<String>();
    private static ArrayList<String> negAdjectives = new ArrayList<String>();

    private static final String SPACE = " ";
    static{
        try {
            Scanner input = new Scanner(new File("cleanSentiment.csv"));
            while(input.hasNextLine()){
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0],Double.parseDouble(temp[1]));
                //System.out.println("added "+ temp[0]+", "+temp[1]);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }

        //read in the positive adjectives in postiveAdjectives.txt
        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while(input.hasNextLine()){
                String temp = input.nextLine().trim();
                //System.out.println(temp);
                posAdjectives.add(temp);
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }   

        //read in the negative adjectives in negativeAdjectives.txt
        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while(input.hasNextLine()){
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }   
    }

    /** 
     * returns a string containing all of the text in fileName (including punctuation), 
     * with words separated by a single space 
     */

    public static double totalSentiment(String fileName){
        String Review = textToString(fileName);
        String space = " ";
        double reviewVal = 0;
        while(Review.indexOf(space)>=0){
            int spaceInd = Review.indexOf(space);
            String word = Review.substring(0, spaceInd);
            String wordNoPunc = removePunctuation(word);
            double wordVal = sentimentVal(wordNoPunc);
            reviewVal += wordVal;
            Review= Review.substring(spaceInd + 1);
        }
        String lastWordNoPunc = removePunctuation(Review);
        double lastWordVal = sentimentVal(lastWordNoPunc);
        reviewVal += lastWordVal;
        return reviewVal;

    }

    public static int starRating(String filename){
        double reviewVal = totalSentiment(filename);
        int starRating = 0;
        if(reviewVal<1){
            starRating = 0;
        }else if(reviewVal>=1 && reviewVal<2){
            starRating = 1;
        }else if(reviewVal>=2 && reviewVal<3){
            starRating = 2;
        }else if(reviewVal>=3 && reviewVal<4){
            starRating = 3;
        }else if(reviewVal>=4 && reviewVal<5){
            starRating = 4;
        }else if(reviewVal>=5){
            starRating = 5;
        }
        return starRating;
    }

    public static String fakeReview(String fileName){
        String review = textToString(fileName);
        System.out.println(review);
        for (int i=0; i<review.length(); i++){

            if(i== review.indexOf("*")){
                String before = review.substring(0, review.indexOf("*"));

                String adjAndAft = review.substring(review.indexOf("*"));
                String adjective = adjAndAft.substring(0, adjAndAft.indexOf(" "));
                String onlyAdj = adjective.substring(1);
                onlyAdj = removePunctuation(onlyAdj);
                int BefAndAdj =  before.length() + adjective.length();
                double adjectiveVal = sentimentVal(onlyAdj);

                String after = review.substring(BefAndAdj);
                String newAdj = randomAdjective();

                if(adjectiveVal>0){
                    newAdj = randomPositiveAdj();
                    while(sentimentVal(newAdj)<= adjectiveVal){
                        newAdj = randomPositiveAdj();
                    }
                } else {
                    newAdj = randomNegativeAdj();
                    while(sentimentVal(newAdj)>= adjectiveVal){
                        newAdj = randomNegativeAdj();
                    }
                }
                review = before + newAdj + after;
            }
        }
        return review;
    }

    public static String textToString( String fileName )
    {  
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            //add 'words' in the file to the string, separated by a single space
            while(input.hasNext()){
                temp = temp + input.next() + " ";
            }
            input.close();

        }
        catch(Exception e){
            System.out.println("Unable to locate " + fileName);
        }
        //make sure to remove any additional space that may have been added at the end of the string.
        return temp.trim();
    }

    /**
     * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
     */
    public static double sentimentVal( String word )
    {
        try
        {
            return sentiment.get(word.toLowerCase());
        }
        catch(Exception e)
        {
            return 0;
        }
    }

    /**
     * Returns the ending punctuation of a string, or the empty string if there is none 
     */
    public static String getPunctuation( String word )
    { 
        String punc = "";
        for(int i=word.length()-1; i >= 0; i--){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    /**
     * Returns the word after removing any beginning or ending punctuation
     */
    public static String removePunctuation( String word )
    {
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
        {
            word = word.substring(1);
        }
        while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
        {
            word = word.substring(0, word.length()-1);
        }

        return word;
    }

    /** 
     * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
     */
    public static String randomPositiveAdj()
    {
        int index = (int)(Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    /** 
     * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
     */
    public static String randomNegativeAdj()
    {
        int index = (int)(Math.random() * negAdjectives.size());
        return negAdjectives.get(index);

    }

    /** 
     * Randomly picks a positive or negative adjective and returns it.
     */
    public static String randomAdjective()
    {
        boolean positive = Math.random() < .5;
        if(positive){
            return randomPositiveAdj();
        } else {
            return randomNegativeAdj();
        }
    }
}
