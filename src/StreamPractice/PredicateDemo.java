package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Maria", "Laura", "Natalia", "Diana","Mia","Mariana");
        //Declare String type predicate and use lambda expression to create object.
        Predicate<String> predicate = (s) -> s.startsWith("M");

        System.out.println("Names that starts with M:");
        for (String name: list) {
            //test each entry with predicate
            //Using the functional interface Predicate, we test if the item in the string starts
            // with M and if it does, then it prints the name.
            if (predicate.test(name)){
                System.out.println(name);
            }
        }
    }
}
