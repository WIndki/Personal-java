package 作业5;
import java.util.*;

public class 两数列数最小和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = scanner.nextInt();
            }
            int[] sums = new int[n * n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sums[index++] = A[i] + B[j];
                }
            }
            Arrays.sort(sums);
            for (int i = 0; i < n; i++) {
                System.out.print(sums[i]);
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}


