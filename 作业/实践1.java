import java.util.Scanner;

public class 实践1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ranges = input.next();
        String[] range = ranges.split("-");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        input.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
