
public class NumberOfWords {
    public static void main(String[] args) {
        String line = "This is a string example in Java";
        System.out.println(line);
        int numberOfWords = 0;
        line.split("\s");
        String[] arrStr = line.split("\s");
        numberOfWords = arrStr.length;
        System.out.println("The number of words in this line is: " +numberOfWords);

        //reverse string
        System.out.println("=======String in reverse word by word=======");
        for (int i=numberOfWords-1; i >= 0; i--) {
            System.out.print(arrStr[i]);
            System.out.print(" ");
        }
    }
}
