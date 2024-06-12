package 作业5;
import java.util.Scanner;
public class 密信转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String encryptedMessage = scanner.nextLine();
            String translatedMessage = translateMessage(encryptedMessage);
            System.out.println(translatedMessage);
        }
        scanner.close();
    }

    public static String translateMessage(String encryptedMessage) {
        StringBuilder translatedMessage = new StringBuilder();
        for (char c : encryptedMessage.toCharArray()) {
            switch (c) {
                case 'b':
                    translatedMessage.append(' ');
                    break;
                case 'q':
                    translatedMessage.append(',');
                    break;
                case 't':
                    translatedMessage.append('!');
                    break;
                case 'm':
                    translatedMessage.append('l');
                    break;
                case 'i':
                    translatedMessage.append('e');
                    break;
                case 'c':
                    translatedMessage.append('a');
                    break;
                case 'a':
                    translatedMessage.append('c');
                    break;
                case 'e':
                    translatedMessage.append('i');
                    break;
                case 'l':
                    translatedMessage.append('m');
                    break;
                default:
                    translatedMessage.append(c);
                    break;
            }
        }
        return translatedMessage.toString();
    }
}
