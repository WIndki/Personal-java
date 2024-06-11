package 实验改.实验4;
import java.lang.Thread;
import java.lang.Runnable;
public class 售票问题 {
    private static int tickets = 10;
    protected static Object lock = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketSeller(), "窗口1");
        Thread t2 = new Thread(new TicketSeller(), "窗口2");
        Thread t3 = new Thread(new TicketSeller(), "窗口3");
        Thread t4 = new Thread(new TicketSeller(), "窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static class TicketSeller implements Runnable {
        @Override
        public void run() {
            while (tickets > 0) {
                synchronized (lock) {
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "售出第" + tickets + "张票");
                        tickets--;
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
