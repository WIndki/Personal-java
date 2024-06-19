package 练习2;
import java.util.Scanner;
public class 交换最小值和最大值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = sc.nextInt();
            if(count == 0)continue;
            int[] arr = new int[count];
            for(int i=0;i<count;i++){
                arr[i] = sc.nextInt();
            }
            int max_index = 0;
            int min_index = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[max_index]){
                    max_index = i;
                }
                if(arr[i]<arr[min_index]){
                    min_index = i;
                }
            }
            if(max_index+min_index != arr.length-1){
                int temp = arr[max_index];
                arr[max_index] = arr[arr.length-1];
                arr[arr.length-1] = temp;
                temp = arr[min_index];
                arr[min_index] = arr[0];
                arr[0] = temp;
            }else if(max_index == 0 && min_index == arr.length-1){
                int temp = arr[max_index];
                arr[max_index] = arr[arr.length-1];
                arr[arr.length-1] = arr[min_index];
                arr[min_index] = temp;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
                if(i!=arr.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
