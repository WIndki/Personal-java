import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int[] ns = new int[n];
        for(int i=0;i<n;i++){
            ns[i] = scanner.nextInt();
        }
        for(int i:ns){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        int Index = 0;
        System.out.println("Selection Sort");
        System.out.printf("总共%d个数\n",ns.length);
        for(int i=0;i<ns.length;i++){
            Index=i;
            for(int j=i;j<ns.length;j++){
                if(ns[Index]>ns[j]){
                    Index=j;
                }
            }
            int temp = ns[i];
            ns[i] = ns[Index];
            ns[Index] = temp;
        }
        for(int i: ns) {
            System.out.print(i+" ");
        }
    }
}