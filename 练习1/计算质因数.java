package 练习1;
import java.util.Scanner;
public class 计算质因数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("  ");

        for (String number : numbers) {
            int n = Integer.parseInt(number);
            System.out.print(n + "=");
            primeFactorization(n);
            System.out.println();
        }
    }

    public static void primeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n != 1) {
                    System.out.print("*");
                }
            }
        }
    }
}
