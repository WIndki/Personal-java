package 实验改.实验4;
public class 生产者与消费者 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Producer producer = new Producer(buffer,1);
        Consumer consumer = new Consumer(buffer,1);
        Consumer consumer2 = new Consumer(buffer,2);
        producer.start();
        consumer.start();
        consumer2.start();
    }
}

class Buffer {
    private int[] buffer;
    private int size;
    private int in;
    private int out;
    private int count;
    public Buffer(int size) {
        this.size = size;
        buffer = new int[size];
        in = 0;
        out = 0;
        count = 0;
    }
    public synchronized void put(int value, int ThreadID) {
        while (count == size) {
            try {
                System.out.println("Producer"+ ThreadID +": wait");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producer"+ ThreadID +": try to put " + value);
        buffer[in] = value;
        in = (in + 1) % size;
        count++;
        notifyAll();
        System.out.println("Producer"+ ThreadID +": put " + value + " success");
    }
    public synchronized int get(int ThreadID) {
        while (count == 0) {
            try {
                System.out.println("Consumer"+ ThreadID +": wait");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer"+ ThreadID +": try to get");
        int value = buffer[out];
        out = (out + 1) % size;
        count--;
        notifyAll();
        System.out.println("Consumer"+ ThreadID +": get " + value + " success");
        return value;
    }
}// Buffer循环缓冲区

class Producer extends Thread {
    private int ThreadID;
    private Buffer buffer;
    public Producer(Buffer buffer, int ThreadID) {
        this.buffer = buffer;
        this.ThreadID = ThreadID;
    }
    public void run() {
        System.out.println("Producer"+ ThreadID +": start");
        for (int i = 0; i < 20; i++) {
            buffer.put((int)(Math.random() * 100), ThreadID);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}// 生产者

class Consumer extends Thread {
    private int ThreadID;
    private Buffer buffer;
    public Consumer(Buffer buffer, int ThreadID) {
        this.buffer = buffer;
        this.ThreadID = ThreadID;
    }
    public void run() {
        System.out.println("Consumer"+ ThreadID +": start");
        for (int i = 0; i < 10; i++) {
            int value = buffer.get(ThreadID);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}// 消费者

