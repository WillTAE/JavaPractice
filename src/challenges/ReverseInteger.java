package challenges;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        int numberToReverse = 0;

        Scanner io = new Scanner(System.in);
        System.out.println("Enter an integer number to be reversed: ");
        numberToReverse = io.nextInt();
        int reversed = reverseInteger(numberToReverse);
        System.out.println("Reversed number is: " +reversed);
    }
    private static int reverseInteger(int numToReverse) {
        int reversed = 0;
        while (numToReverse != 0){
            int remain = numToReverse % 10;
            reversed = reversed * 10 + remain;
            numToReverse /= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE ){
                return 0;
            }
        }
        return reversed;
    }
}
