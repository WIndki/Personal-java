package 实验改.实验4;
import java.lang.Thread;
import java.lang.Runnable;
public class 吵醒休眠的进程 {
    public static void main(String[] args) {
        Thread student = new Thread(new Runnable(){
            public void run(){
            try {
                System.out.println("张三正在睡觉，不听课");
                Thread.sleep(3600000); 
            } catch (InterruptedException e) {
            }
            System.out.println("张三被老师叫醒了");
            System.out.println("张三开始听课");
            }
        });

        Thread teacher = new Thread(new Runnable(){
            public void run(){
            try {
                Thread.sleep(2000); 
                System.out.println("上课");
                Thread.sleep(1000); 
                System.out.println("上课");
                Thread.sleep(1000); 
                System.out.println("上课");
                student.interrupt(); // 唤醒student
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        });

        student.start();
        teacher.start();
    }
}
