public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }
    
     public String getResponse(String statement) {

        String response = "";
        String response2 = statement.trim();
        
        int findYou = findKeyword(statement, "you", 0);
        int findMe = findKeyword(statement, "me", 0);
        int findI = findKeyword(statement, "I", 0);
        
        if(findYou>=0 && findMe>=0 && findYou<findMe){
            response = transformYouMeStatement(statement);
        } else if (findI>=0 && findYou>=0 && findI<findYou){
            response = transformIMeStatement(statement);
        }else if(findKeyword(statement, "I want to", 0)>=0){
            response = transformIWantToStatement(statement);
        }else if(findKeyword(statement, "I want", 0)>=0){
            response = transformIWantStatement(statement);
        }
        else if (findKeyword(statement, "mother", 0)>=0
        || findKeyword(statement, "father", 0)>=0
        || findKeyword(statement, "sister", 0)>=0
        || findKeyword(statement, "brother", 0)>=0)
        {response = "Tell me more about your family.";}  

        else if (findKeyword(statement, "no", 0)>=0) {
            response = "Why so negative?";
        } 

        else if (findKeyword(statement, "cat", 0)>=0
        || findKeyword(statement, "dog", 0)>=0
        || findKeyword(statement, "fish", 0)>=0
        || findKeyword(statement, "hamster", 0)>=0) 
        {response = "Tell me more about your pets.";} 

        else if (findKeyword(statement, "nina", 0)>=0 || findKeyword(statement, "Nina", 0)>=0) {
            response = "She sounds like the best person ever!";

        }else if (findKeyword(statement, "stupid", 0)>=0 || (findKeyword(statement, "nah", 0)>=0)|| findKeyword(statement, "nope", 0)>=0 || (findKeyword(statement, "bad", 0)>=0)) {
            response = "Stop being so negative!";

        }else if (findKeyword(statement, "good", 0)>=0 || (findKeyword(statement, "cool", 0)>=0 || findKeyword(statement, "nice", 0)>=0 )) {
            response = "I like your positivity!";

        }else if (response2.length()==0) {
            response = "Care to say anything?";

        }else{
            response = getRandomResponse();
        }

        return response;
    }


    public String transformYouMeStatement(String statement) {
        //Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }

        int posOfYou = findKeyword(statement, "you", 0);
        int posOfMe  = findKeyword(statement, "me",  posOfYou + 3);

        String restOfStatement = statement.substring(posOfYou + 3, posOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    public String transformIWantToStatement(String statement) {
        //Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int pos = findKeyword(statement, "I want to", 0);
        String restOfStatement = statement.substring(pos + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }

    public String transformIWantStatement(String statement){
        // ADD CODE HERE
        return "Would you really be happy if you had " + restOfStatement;
    }

    public String transformIMeStatement(String statement) {
        // ADD CODE HERE
        return "Why do you " + restOfStatement + "me?";
    }


    public int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in the line below
        int goalPos = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a word
        while (goalPos >= 0) {
            // Find the string of length 1 before and after the word
            String before = " ";
            String after = " ";

            if (goalPos > 0) {
                before = phrase.substring(goalPos - 1, goalPos);
            }

            if (goalPos + goal.length() < phrase.length()) {
                after = phrase.substring(goalPos + goal.length(), goalPos + goal.length() + 1);
            }

            /* determine the values of goalPos, before, and after at this point */

            // If before and after aren't letters, we've found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&                
            ((after.compareTo("a")  < 0) || (after.compareTo("z")  > 0))) {
                return goalPos;
            }

            // The last position didn't work, so let's find the next, if there is one.
            goalPos = phrase.indexOf(goal,goalPos + 1);
        }
        return -1;
    }

   
    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        }else if (whichResponse == 4) {
            response = "Are you lying to me right now?";
        }else if (whichResponse == 5) {
            response = "No way!!";
        }else if (whichResponse == 6) {
            response = "I am not sure what you mean...";
        }

        return response;
    }
}