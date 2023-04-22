package challenges;

import java.util.ArrayList;
import java.util.List;

public class FilterLettersFromString {

    public static String[] getFilteredLetters(String words[], String letter) {
        char letters[] = letter.toCharArray();
        List<String> filteredWords = new ArrayList<>();
        for (String word: words) {
            boolean containsChar = false;
            char[] chars = word.toCharArray();
            for (int i=0; i<chars.length; i++){
                for (int j = 0; j < letters.length; j++) {
                    if (chars[i] == letters[j]){
                        filteredWords.add(word);
                        containsChar = true;
                        break;
                    }
                }
                if (containsChar){
                    break;
                }
            }
        }
        String[] returnString = new String[filteredWords.size()];
        returnString = filteredWords.toArray(returnString);
        return returnString;
    }

    public static void main(String[] args) {
        String[] words = {"left", "the", "ball", "at", "your", "right"};
        String letters = "ay";
        String[] filteredWords = getFilteredLetters(words, letters);
        System.out.println("The filtered words are: ");
        for (String word: filteredWords) {
            //System.out.print(" ");
            System.out.print(word);
            System.out.print(" ");
        }
    }
}
