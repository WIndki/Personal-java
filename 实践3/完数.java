import java.util.Scanner;
public class 完数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int N = scanner.nextInt();
            for (int i = 1; i <= N; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.println(i); 
                }
            }
        }
        scanner.close();
    }
}
