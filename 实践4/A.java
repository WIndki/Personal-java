import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        int count = 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            sum += number;
            count++;
        }

        System.out.print(count + ":" + sum);
        scanner.close();
    }
}
/*这段代码是一个Java程序，它的主要功能是从用户输入中找出所有的数字，并计算这些数字的总和以及数字的数量。

首先，我们导入了java.util.Scanner和java.util.regex包。Scanner类用于读取用户的输入，而regex包中的Pattern和Matcher类用于处理正则表达式。

在main方法中，我们首先创建了一个Scanner对象，用于从控制台读取用户的输入。然后，我们调用nextLine方法读取用户输入的一行文本，并将其存储在input变量中。

接下来，我们定义了两个整型变量sum和count，分别用于存储数字的总和和数字的数量。

然后，我们使用Pattern.compile("\\d+")创建了一个Pattern对象。这里的正则表达式"\\d+"表示一个或多个数字。然后，我们使用pattern.matcher(input)创建了一个Matcher对象，用于在input中查找与pattern匹配的子串。

在接下来的while循环中，我们使用matcher.find()方法在input中查找下一个与pattern匹配的子串。如果找到了匹配的子串，我们就使用matcher.group()方法获取这个子串，然后使用Integer.parseInt方法将这个子串转换为整数。然后，我们将这个整数加到sum上，并将count加1。

最后，我们使用System.out.print方法打印出数字的数量和总和，然后关闭scanner。

总的来说，这段代码的主要功能是读取用户的输入，找出其中的所有数字，然后计算这些数字的总和和数量。 */