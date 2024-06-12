import java.util.Scanner;

public class Dateprocess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String date = sc.nextLine();
            String[] dateArr = date.split("-");
            int month = Integer.parseInt(dateArr[1]);
            System.out.println(month);
        }
        sc.close();
    }
}
