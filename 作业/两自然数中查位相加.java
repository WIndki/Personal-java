import java.util.Scanner;
public class 两自然数中查位相加 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();
            number[] numbers = new number[end - start + 1];
            for(int i = start; i <= end; i++){
                numbers[i-start] = new number(i);
            }
            int sum=0;
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i].isExist(num)){
                    sum += numbers[i].num;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}

class number{
    public int num;
    private int[] numArr;

    public number(int num){
        this.num = num;
        int count = 0;
        int temp = num;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        this.numArr = new int[count];
        for(int i = 0; i < count; i++){
            numArr[i] = num % 10;
            num /= 10;
        }
    }

    public boolean isExist(int num){
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] == num){
                return true;
            }
        }
        return false;
    }
}
