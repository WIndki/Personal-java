import java.io.*;
import java.util.*;
public class 排序{
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String ranges = scanner.next();
        String[] range = ranges.split(",");
        int[] arr = new int[range.length];
        for(int i=0;i<range.length;i++){
            arr[i] = Integer.parseInt(range[i]);
        }
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        scanner.close();
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}