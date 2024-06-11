package 实验改.实验4;

public class 线程的状态 {
    public static void main(String[] args) {
        Rabbit rabit;
        rabit =  new Rabbit(1000,"兔子",4);
        Tortoise tortoise;
        tortoise = new Tortoise(500, "乌龟", 10);
        rabit.start();
        tortoise.start();;
    }
}

class Tortoise extends Thread {
    int sleepTime = 0, liveLength = 0;

 Tortoise(int sleepTime,String name,int liveLength)
 {
 this.sleepTime=sleepTime;
 this.liveLength=liveLength;
 this.setName(name);
 }

 public void run()
 { 
 while(true)
 {
 liveLength--;
 System.out.printf("@");
 try
 { 
//让线程调用 sleep()方法进入中断状态，sleepTime 毫秒后
//线程重新排队，等待 CPU 资源
sleep(sleepTime);
 }
 catch(InterruptedException e)
 {
 }
 if(liveLength<=0)
 {
 System.out.printf(getName()+"进入死亡状态\n");
 //结束 run()方法的语句
 break;
 }
 }
 }
}

class Rabbit extends Thread {
    int sleepTime = 0, liveLength;

 Rabbit(int sleepTime,String name,int liveLength)
 {
 this.sleepTime = sleepTime;
 this.liveLength = liveLength;
 this.setName(name);
 }
 public void run()
 { 
 while(true)
 {
 liveLength--;
 System.out.printf("*");
 try
 { 
 sleep(sleepTime);//让线程调用 sleep()方法进入中断状态，sleepTime 毫秒后
//线程重新排队，等待 CPU 资源
 }
 catch(InterruptedException e)
 {
 }
 if(liveLength<=0)
 {
 System.out.printf(getName()+"进入死亡状态\n");
 break;//结束 run()方法的语句
 }
 }
 }
}