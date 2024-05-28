import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            try {
                LocalDate.parse(date, formatter);
                System.out.println("legal date format!");
            } catch (Exception e) {
                System.out.println("illegal date format!");
            }
        }
        sc.close();
    }
}