public class Palindrome {
    public static void main(String[] args) {
        String word = "level";
        String reverseWord = "";

        for (int i= word.length()-1; i>=0; i--){
            reverseWord = reverseWord + word.charAt(i);
        }
        if (word.equals(reverseWord)){
            System.out.println("The word: " + word + ", is a Palindrome");
        }else {
            System.out.println("The word: " + word + ", is NOT a Palindrome");
        }
    }
}
