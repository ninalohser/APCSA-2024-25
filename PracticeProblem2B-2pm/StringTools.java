
/**
 * Problem Set 2B
 * Nina Lohser
 * September 25th 2024
 */

class StringTools {

    /** public String lastLetter(String str) {
        int len = str.length(); 
        return str.substring(len-1);
    }

    public String formatPhoneNumber(String str){
        return "(" + str.substring(0, 3) + ") " + str.substring(3,6) + "-" + str.substring(6,10);
    }

    public String middleThree(String str){
        int len = str.length();
        int middle = len/2;
        return str.substring(middle-1, middle+2);
    }

    public String swapLastTwo (String str){
        int len = str.length();
        return  str.substring(0, len-2) + str.substring(len-1) + str.substring(len-2, len-1);
    }
    */

    public String frontAgain (String str, int n){
        int len = str.length();
        int firstLetters = str.substring(0, n);
        int lastLetters = str.substring(len-n, len);
        
        return str.substring(0, n) + str.substring(len-n, len);
        
        return boolean equals (firstLetters lastLetters);
  
    }
    
    
}

