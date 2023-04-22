package Java8.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        /*MyFunction test1 = (i) -> System.out.println("Test method in the interface executed...");
        test1.test(15);*/

        /*MyFunction function = (i) -> i*10;
        System.out.println(function.test(100));*/

        List<String> list = Arrays.asList("Pele", "Lio", "Dinho", "Pelusa");
        String[] arrToString = new String[list.size()];
        arrToString = list.toArray(arrToString);
        for (String word: arrToString) {
            System.out.println(word);
        }
        System.out.println("Ordered List: ");
        Arrays.stream(arrToString).sorted().forEach(System.out::println);

        List<String> songTitles = Arrays.asList("humble", "element", "dna");
        System.out.println("The songs list");
        Function<String, String> capitalize = str -> str.toUpperCase();

        songTitles.stream().map(capitalize).forEach(System.out::println);
        //Another way to do the same but less complex
        songTitles.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

        String buy = "bitcoin";
        System.out.println(buy.substring(0,1) + buy.substring(2,4));

        Double pickle = 2.0;
        int jar = pickle.intValue();
        System.out.println("AutoBoxing: " +pickle*jar);


        /*MyFunction function = (s1, s2) -> s1+s2;
        System.out.println(function.test("abcd", "efgh"));*/
    }
}
