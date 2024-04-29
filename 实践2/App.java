import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        List<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int currentIndex = 0;
        while (circle.size() > 2) {
            currentIndex = (currentIndex + 2) % circle.size();
            circle.remove(currentIndex);
        }
        int i =0;
        for (int number : circle) {
            i++;
            System.out.print(number);
            if(i!=circle.size())System.out.print(" ");
        }
    }
}