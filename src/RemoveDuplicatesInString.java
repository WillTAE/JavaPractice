public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String duplicates = "Mississippi";
        StringBuffer sb1 = new StringBuffer();
        duplicates.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println("String without duplicates: " +sb1);
    }
}
