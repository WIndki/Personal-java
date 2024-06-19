package 练习2;
import java.util.Scanner;
public class 求整数的位数以及各位数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-- > 0){
            String num = sc.next();
            int sum = 0;
            int number = 0;
            for(char c:num.toCharArray()){
                if(c != '-'){
                    sum += c - '0';
                    number++;
                }
            }
            System.out.println("number="+number+",sum="+sum);
        }
    }
}
