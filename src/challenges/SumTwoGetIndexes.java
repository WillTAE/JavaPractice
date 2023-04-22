package challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * This class solves the problem: Given an array of integers, return indices of the two numbers such that they add up
 * to a specific target
 */

public class SumTwoGetIndexes {

    public static int[] getSumOfTwo(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i=0; i<numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {20, 30, 60, 70, 100};
        int target = 100;
        int[] result = getSumOfTwo(nums, target);
        System.out.println("Array Indexes that sums target: " +result[0] + " " + result[1]);
    }
}
