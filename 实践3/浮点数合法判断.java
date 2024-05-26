import java.util.Scanner;

public class 浮点数合法判断 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            
            if (isValidFloat(input)) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isValidFloat(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
