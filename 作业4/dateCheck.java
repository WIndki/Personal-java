import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String date = sc.nextLine();
            if(isLegalDate(date)) {
                System.out.println("legal date format!");
            } else {
                System.out.println("illegal date format!");
            }
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

    public static boolean isLegalDate(String date) {
        String[] dateArr = date.split("-");
        if(dateArr.length != 3) {
            return false;
        }
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        if(year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30) {
                return false;
            }
        }
        if(month == 2) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                if(day > 29) {
                    return false;
                }
            } else {
                if(day > 28) {
                    return false;
                }
            }
        }
        return true;
    }
}