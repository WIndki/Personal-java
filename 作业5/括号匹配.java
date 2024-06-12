package 作业5;
import java.util.Stack;
import java.util.Scanner;

public class 括号匹配 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[] lines = input.split("\n");
            for (String line : lines) {
                if (isBalanced(line)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
        scanner.close();
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}