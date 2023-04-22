package collections;

import java.util.Arrays;
import java.util.OptionalInt;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class ClosestToZero {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE, closestNum = 0;
        for (int num: nums) {
            if(Math.abs(num) < min){
                min = Math.abs(num);
                closestNum = num;
            } else if (Math.abs(num) == min && num > closestNum) {
                closestNum = num;
            }
        }
        /* Using Java 8
        int min = Arrays.stream(nums).filter(i -> i != 0)
                .reduce((a,b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a,b) : b))
                .getAsInt();*/
        return closestNum;
    }

    public static void main(String[] args) {
        int[] nums = {3,10,-5,-1,8};
        ClosestToZero closestToZero = new ClosestToZero();
        int closest = closestToZero.findClosestNumber(nums);
        System.out.println("The closest value to zero is: "+closest);
    }
}
