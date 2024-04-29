import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        for (int i = 1; i <= N; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
