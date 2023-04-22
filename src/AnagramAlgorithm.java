import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnagramAlgorithm {
    static boolean stringsHaveSameFrequency(String a, String b){
        boolean sameFrecuency = false;
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
        if (map.equals(map2)){
            sameFrecuency = true;
        }
        return sameFrecuency;
    }
    static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;
        if(a.length() == b.length() && stringsHaveSameFrequency(a, b)){
            for(int i=0; i<a.length(); i++){
                if(b.contains(String.valueOf(a.charAt(i)))){
                    isAnagram = true;
                }
            }
        }else{
            return isAnagram = false;
        }
        return isAnagram;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String a = scan.next();
        System.out.print("Enter second word: ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
