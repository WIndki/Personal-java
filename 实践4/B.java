import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); 
            int M = scanner.nextInt(); 

            int count = 0; 

            for (int j = 0; j < N; j++) {
                int goodCourses = 0; 

                for (int k = 0; k < M; k++) {
                    int score = scanner.nextInt(); 

                    if (score > 80) {
                        goodCourses++;
                    }
                }

                if (goodCourses > 3) {
                    count++;
                }
            }

            System.out.print(count);
            if(T - 1 != i) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
