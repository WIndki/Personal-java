import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int n = sc.nextInt();
            int[] circle = new int[n];
            for (int i = 0; i < n; i++) {
                circle[i] = i + 1;
            }
            
            int current = 0;
            while (n > 2) {
                int count = 0;
                while (count < 3) {
                    if (circle[current] != 0) {
                        count++;
                    }
                    if (count < 3) {
                        current = (current + 1) % n;
                    }
                }
                circle[current] = 0;
                n--;
            }
            
            for (int i = 0; i < circle.length; i++) {
                if (circle[i] != 0) {
                    System.out.print(circle[i] + " ");
                }
            }
        }
    }
}

