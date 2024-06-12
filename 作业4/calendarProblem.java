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
        //output = output.toLowerCase();
        //output = output.substring(0, 1).toUpperCase() + output.substring(1);
        output = output.substring(0,1)+output.substring(1).toLowerCase();
        System.out.println(output);
        System.out.println(caieCalulate(dateString));
        }
        sc.close();
    }

    public static String caieCalulate(String date) {
        String[]  parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        if(month == 1 || month == 2) {
            month += 12; // 1,2月看作上一年的13,14月
            year--;
        }
        int week = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;//蔡勒公式
        String[] weekArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return weekArr[week];
    }
}

