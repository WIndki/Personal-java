import java.util.Scanner;

public class 自然数和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            SumOfDigits sumOfDigits = new SumOfDigits(num);
            System.out.println(sumOfDigits.getSum());
        }
        scanner.close();
    }
}

class SumOfDigits{
    private int num;
    private int sum;

    public SumOfDigits(int num){
        this.num = num;
        this.sum = (1+num)*num/2;
    }

    public int getSum(){
        return sum;
    }

}
