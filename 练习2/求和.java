package 练习2;
import java.util.Scanner;
public class 求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-- > 0){
            int num = sc.nextInt();
            int sum = 0;
            for(int i=0;i<=num;i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
