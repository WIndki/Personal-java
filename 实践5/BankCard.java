package 实践5;
import java.util.Scanner;
public class BankCard {
    public int id;
    private float balance;
    BankCard(int id){
        this.id = id;
        this.balance = 0;
    }
    public synchronized void chanage(double amount){
        balance += amount;
    }
    public synchronized float getBalance(){
        return balance;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int op_count = sc.nextInt();
        BankCard card = new BankCard(id);
        while(op_count-- > 0){
            int amount = sc.nextInt();
            card.chanage(amount);
        }
        System.out.printf(id + ",%.2f", card.getBalance());
    }
}
