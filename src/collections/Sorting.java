package collections;

import java.io.PrintStream;
import java.util.Scanner;

public class Sorting {
    //Return the index that contains the bigger num in an Array
     public static int solve(int weight0, int weight1, int weight2){
        int[] w = {weight0, weight1, weight2};
        int heaviest = 0;
        for (int i=0; i<w.length; i++){
            System.out.println("Position["+i+"]: " + w[i]);
            if(w[i] > w[heaviest]){
                heaviest = i;
            }
        }
        return heaviest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            int weight0 = in.nextInt();
            int weight1 = in.nextInt();
            int weight2 = in.nextInt();
            PrintStream outStream = System.out;
            System.setOut(System.err);
            int action = solve(weight0, weight1, weight2);
            System.setOut(outStream);
            System.out.println(action);

        }
    }
}
