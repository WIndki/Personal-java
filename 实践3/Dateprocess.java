import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Dateprocess{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLine()){
        String date = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d = sdf.parse(date);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            //int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            //int day = c.get(Calendar.DAY_OF_MONTH);
            System.out.println(month);
        }catch(Exception e){
        }
    }
    sc.close();
    }
}   