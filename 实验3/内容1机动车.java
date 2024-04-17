package 实验3;

public class 内容1机动车 {
    public static void main(String[] args) {
        Vehicle car1,car2;
        car1 = new Vehicle();
        car2 = new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1的功率是："+car1.getPower());
        System.out.println("car2的功率是："+car2.getPower());
        car1.speedUp(80);
        car2.speedUp(100);
        System.out.println("car1的速度是："+car1.getSpeed());
        System.out.println("car2的速度是："+car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1的速度是："+car1.getSpeed());
        System.out.println("car2的速度是："+car2.getSpeed());
        
    }
}

class Vehicle {
    private double speed;
    private int power;
    public void speedUp(int s) {
        speed += s;
    }

    public void speedDown(int s) {
        speed -= s;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

}

