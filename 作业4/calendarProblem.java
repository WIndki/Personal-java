import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class calendarProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        String dateString = sc.nextLine(); 
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String output = dayOfWeek.toString();
        output = output.toLowerCase();
        output = output.substring(0, 1).toUpperCase() + output.substring(1);
        System.out.println(output);
        }
        sc.close();
    }
}