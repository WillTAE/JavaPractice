package Java8.Streams;

import java.util.ArrayList;

public class DemoMethodReference {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add Number to list
        numbers.add(18);
        numbers.add(23);
        numbers.add(32);
        numbers.add(32);
        numbers.add(45);
        numbers.add(63);
        numbers.add(63);
        numbers.forEach(DemoMethodReference::printNumber); //using method reference call for a static method
        System.out.println();
        System.out.println("========Printing remaining after remove smaller than 32========");
        numbers.removeIf(x -> (x<32));
        for (Integer num: numbers) {
            System.out.println(num + " <=32");
        }
        System.out.println("Printing only distinct");
        DemoMethodReference demo = new DemoMethodReference();
        numbers.stream().distinct().forEach(demo::printElement); //using method reference call for a non-static method
    }

    public static void printNumber(int i){
        System.out.println(i);
    }
    public void printElement(int i){
        System.out.println(i);
    }

}
