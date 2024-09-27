
/**
 * Problem Set 2B
 * Nina Lohser
 * September 25th 2024
 */

class StringTools {

     public String lastLetter(String str) {
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
    

    public String frontAgain2 (String str, int n){
        int len = str.length();

        String firstLetters = str.substring(0, n);
        String lastLetters = str.substring(len-n, len);

        return " (" + firstLetters + "-" + lastLetters + " )";
    }

    public boolean frontAgain (String str, int n){
        int len = str.length();

        String firstLetters = str.substring(0, n);
        String lastLetters = str.substring(len-n, len);
        String lettersTogether = str.substring(0, n) + str.substring(len-n, len);

        return firstLetters.equals(lastLetters);

    }


}

