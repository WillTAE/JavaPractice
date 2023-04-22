import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String a = "anagram";
        String b = "margana";
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(int i = 0; i<a.length(); i++){
            list1.add(a.charAt(i));
        }
        for(int i = 0; i<b.length(); i++){
            list2.add(b.charAt(i));
        }

        Map<Character, Integer> map = list1.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

        Map<Character, Integer> map2 = list2.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

        map.forEach((k,v) -> {
            System.out.println(k + " occurs " + v + " times");
        });
        System.out.println("********************************");
        map2.forEach((k,v) -> {
            System.out.println(k + " occurs " + v + " times");
        });
        if (map.equals(map2)){
            System.out.println("Same frequency");
        }else {
            System.out.println("Different frequency");
        }
    }
}