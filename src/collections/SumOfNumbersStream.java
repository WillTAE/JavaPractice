package collections;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class SumOfNumbersStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 2, 8, 9, 70, 45, 34, 20, 18);
        Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
        int max = list.stream().mapToInt(value -> value).max().orElseThrow(NoSuchElementException::new);
        int min = list.stream().mapToInt(value -> value).min().orElseThrow(NoSuchElementException::new);
        System.out.println("Sum of all numbers in the list is: " +sum.get());
        System.out.println("Max value of all numbers in the list is: " +max);
        System.out.println("Min value of all numbers in the list is: " +min);
    }
}
