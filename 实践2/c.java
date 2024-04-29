import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c {
    public static void main(String[] args) {
        String input = "tv1100.0，handset2200.0，notebook3300.0，eat66.66";
        double sum = 0.0;
        String pattern = "\\d+(\\.\\d+)?";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            double number = Double.parseDouble(matcher.group());
            sum += number;
        }

        System.out.printf("total=%10.2fyuan\n", sum);
    }
}
