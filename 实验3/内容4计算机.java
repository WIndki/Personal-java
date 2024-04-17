package 实验3;

public class 内容4计算机 {
    public static void main(String[] args) {
        CPU cpu = new CPU(2200);
        HardDisk HD = new HardDisk(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(HD);
        pc.show();
    
    }
}

class CPU {
    private int speed;
    public CPU(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class HardDisk {
    private int amount;
    public HardDisk(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class PC {
    private CPU cpu;
    private HardDisk HD;
    public PC() {
        cpu = new CPU(2200);
        HD = new HardDisk(200);
    }
    public void setCpu(CPU c) {
        cpu = c;
    }
    public void setHardDisk(HardDisk h) {
        HD = h;
    }
    public void show() {
        System.out.println("CPU速度:" + cpu.getSpeed());
        System.out.println("硬盘容量:" + HD.getAmount());
    }
}
