import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 10; // Number of people in the circle
        List<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int currentIndex = 0;
        while (circle.size() > 2) {
            currentIndex = (currentIndex + 2) % circle.size();
            circle.remove(currentIndex);
        }

        for (int number : circle) {
            System.out.print(number + " ");
        }
    }
}