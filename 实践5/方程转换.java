package 实践5;
import java.util.Scanner;

public class 方程转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] id = new String[]{"m","n","p","i","j","k",""};
        for(int i=0;i<count;i++){
            String output = "";
            for(int j=0;j<7;j++){
                String input = scanner.next();
                if(input == "0"){
                    continue;
                }
                output += input + id[j];
                if(j != 6){
                    output += "+";
                }
            }
            System.out.println(output);
        }
        scanner.close();
    }
}
