package challenges;

public class CodingameChallenge {
    public static void main(String[] args) {
        String num = "48264814";
        int lastDigit = checkDigit(num);
        System.out.println("Check Digit is: "+lastDigit);
    }

    private static int checkDigit(String num) {
        int lastDigit = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int checkDigit = 0;
        for (int i=0; i < num.length(); i++){
            if(i % 2 == 0){
                sumEven = sumEven + Integer.parseInt(Character.toString(num.charAt(i)));

            }else {
                sumOdd = sumOdd + Integer.parseInt(Character.toString(num.charAt(i)));
            }
        }
        System.out.println("SumEven: " +sumEven);
        System.out.println("SumOdd : " +sumOdd);
        checkDigit = (sumEven * 3) + sumOdd;
        lastDigit = checkDigit % 10;
        System.out.println("LastDigit: " +lastDigit);
        if (lastDigit != 0){
            lastDigit = 10 - lastDigit;
        }
        return lastDigit;
    }

}
