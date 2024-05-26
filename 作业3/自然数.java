import java.util.Scanner;
public class 自然数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            try {
                natureNumber natureNumber = new natureNumber(num);
                if (natureNumber.isPrime()) {
                    System.out.println("a prime");
                } else {
                    System.out.println("not a prime");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("not a nature");
            }
        }
        scanner.close();
    }
}

class natureNumber {
    private int num;

    public natureNumber(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException();
        }
        this.num = num;
    }

    public boolean isPrime() {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}