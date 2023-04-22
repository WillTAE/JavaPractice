package Java8.Streams;

import Java8.FunctionalInterfaces.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
        //1. Integer Stream
        /*IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        //2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5) //salta los primeros 5 valores
                .forEach(x -> System.out.print(x));
        System.out.println();

        //3. Integer Stream with sum
        System.out.println(
                "La suma de los primeros 5 números es: "+
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();

        //4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Anery", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //5. Stream from Array, sort, filter and print
        String names[] = {"Juan", "Fernando", "Laura", "Francia", "Maite", "Ximena", "Flor", "Lida"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("F"))
                .sorted()
                .forEach(System.out::println);

        //6. Averages of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        //7. Stream from List, filter and print
        List<String> people = Arrays.asList("Juan", "Fernando", "Laura", "Francia", "Maite", "Ximena", "Flor", "Lida");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("f"))
                .sorted()
                .forEach(System.out::println);

        // 8. Stream rows from text file, sort, filter, and print
        Stream<String> bands = Files.lines(Paths.get("src/Java8/Streams/bands.txt"));
        bands
                .sorted()
                .filter(x->x.length() > 13)
                .forEach(System.out::println);
        bands.close();

        // 9. Stream rows from text file and save to List
        List<String> bands2 = Files.lines(Paths.get("src/Java8/Streams/bands.txt"))
                .filter(x -> x.contains("Rol"))
                .collect(Collectors.toList());
         bands2.forEach(x -> System.out.println(x));*/

         //Return grater than 4 and in ascending order
         /*List<Integer> list = Arrays.asList(23,4,6,8,9,1,2,10);
         list.stream()
                 .filter(x -> x>4)
                 .sorted()
                 .forEach(System.out::println);*/

        //10. Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get("src/Java8/Streams/data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x-> x.length >= 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();



    }
}
