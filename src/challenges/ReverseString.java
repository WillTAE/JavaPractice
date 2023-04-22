package challenges;

public class ReverseString {
    public static void main(String[] args) {
        String word = "anagram";
        String result = reverseStringBuilder(word);
        String resultManual = reverseStringManually(word);
        System.out.println("Reversed using SB: " +result);
        System.out.println("Reversed Manually: " +resultManual);
    }
    private static String reverseStringManually(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i=word.length()-1; i>=0; i--){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    private static String reverseStringBuilder(String word) {
        return new StringBuilder(word)
                .reverse().toString();
    }

}
