import java.util.Scanner;
public class 找出英文字母 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String output = findEnglishLetters(input);
            System.out.println(output);
        }
        scanner.close();
    }

    public static String findEnglishLetters(String input) {
        String result = new String();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result += c;
            }
        }
        return result;
    }
}
