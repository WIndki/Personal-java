package 练习2;
import java.util.Scanner;
public class 绝对值排序 {
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i])<Math.abs(arr[j])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = sc.nextInt();
            if(count == 0)continue;
            int[] arr = new int[count];
            for(int i=0;i<count;i++){
                arr[i] = sc.nextInt();
            }
            arr = sort(arr);
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
