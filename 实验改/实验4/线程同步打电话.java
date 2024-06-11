package 实验改.实验4;
import java.util.Random;
public class 线程同步打电话 {
    public static void main(String[] args) {
        PhoneReceiver receiver = new PhoneReceiver();
        
        Thread phone1 = new Thread(() -> receiver.answerCall("Phone 1"));
        Thread phone2 = new Thread(() -> receiver.answerCall("Phone 2"));
        Thread phone3 = new Thread(() -> receiver.answerCall("Phone 3"));
        
        phone1.start();
        phone2.start();
        phone3.start();
    }
}

class PhoneReceiver {
    public synchronized void answerCall(String phoneName) {
        Random random = new Random();
        int callDuration = random.nextInt(21) + 10; // Generate a random number between 10 and 30
        
        System.out.println(phoneName + " is answering a call...");
        
        try {
            Thread.sleep(callDuration * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(phoneName + " has finished the call.");
    }
}