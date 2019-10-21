
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }
    //done return input
    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }
    //done cat
    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String backwardsString = "";
        int length = valueToBeReversed.length();
        for (int i =length-1; i>=0;i--){
            backwardsString = backwardsString + valueToBeReversed.charAt(i);
        }
        
        return backwardsString;
        
    }
    // done backwards 
    //https://moometric.com/development/java/reverse-a-string-in-java/
    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int stringLength = word.length(); // gets the length of word ie dog 3
        int middleWord = stringLength/2; // divides by 2 to get to the # of the char in the middle
        
      
        return word.charAt (middleWord); /* plugs example word into charAt which gives all the
        letters in the string an index #  then puls out the letter assigned to the index number 
        from stringLength/2*/
    }
    // done middle character
    //https://www.quora.com/How-do-I-extract-letters-from-the-middle-from-a-string-in-Java
    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
