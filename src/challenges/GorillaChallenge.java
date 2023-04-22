package challenges;

import java.util.*;

/**
 * Given an array of distinct integers, determine the minimum absolute difference between any two elements.
 * Print all element pairs with that difference in ascending order
 * i.e {2,4,8,6} answer: 2 4 and 4 6 (which minimum difference is 2)
 */
public class GorillaChallenge {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 5, 11, 4, 12);
        List<Integer> numbers = Arrays.asList(2, 4, 8, 6);
        Map<Map<Integer,Integer>, Integer> integers = closestNumbers(numbers);
        System.out.println(integers);
        integers.entrySet().stream().forEach(e-> System.out.println("Key: " +e.getKey() + " Value: " +e.getValue()));
        //integers.stream().forEach(System.out::println);
    }

    public static Map<Map<Integer,Integer>, Integer> closestNumbers(List<Integer> numbers){
        int min = Integer.MAX_VALUE;
        int delta = 0;
        int cont = 0;
        Map<Map<Integer, Integer>, Integer> pairs = new HashMap<>();
        Map<Integer, Integer> arrayPositions = new HashMap<>();
        while (cont < numbers.size()){
            for (int i=cont+1; i<= numbers.size()-1; i++){
                delta = Math.abs(numbers.get(cont) - numbers.get(i));
                if (delta <= min){
                    min = delta;
                    arrayPositions.put(cont, i);
                    pairs.put(arrayPositions, min);
                }
            }
            cont+=1;
        }
        return pairs;
    }

}
