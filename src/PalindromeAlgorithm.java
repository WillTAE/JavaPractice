import java.util.Scanner;

public class PalindromeAlgorithm {

    static boolean isPalindrome(String p){
        boolean itIs = false;
        String reverse = new StringBuilder(p).reverse().toString();
        if (reverse.equals(p)){
            itIs = true;
        }else {
            return itIs;
        }
        return itIs;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the possible palindrome word: ");
        String a = scanner.next();
        boolean result = isPalindrome(a);
        if (result){
            System.out.println("Yes, this word is a palindrome");
        }else {
            System.out.println("No, this word is not a palindrome");
        }
    }
}
