import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading T

        for (int i = 0; i < T; i++) {
            String fileName = scanner.nextLine();
            String[] parts = fileName.split("\\.");

            String extension = parts[parts.length - 1];
            String language = determineLanguage(extension);

            System.out.println(language);
        }

        scanner.close();
    }

    private static String determineLanguage(String extension) {
        switch (extension) {
            case "java":
                return "java";
            case "cpp":
                return "c++";
            case "c":
                return "c";
            default:
                return "none";
        }
    }
}