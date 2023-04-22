package challenges;
import java.io.*;
import java.time.LocalDate;
public class GetDayNameOfWeek {

    public static String findDay(int month, int day, int year) {
        String dayToReturn = "";
        LocalDate someDate = LocalDate.of(year, month, day);
        dayToReturn = someDate.getDayOfWeek().toString();
        return dayToReturn;
    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        String res = findDay(02, 25, 2023);
        System.out.println("The day of that date is: " +res);
    }
}
