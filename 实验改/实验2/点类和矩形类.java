package 实验改.实验2;
public class 点类和矩形类 {
    public static void main(String[] args) {
        点类 topLeft = new 点类(0, 0);
        点类 bottomRight = new 点类(15, 25);
        矩形类 矩形 = new 矩形类(topLeft, bottomRight);
        int 周长 = 矩形.计算周长();
        int 面积 = 矩形.计算面积();
        System.out.println("矩形的周长：" + 周长);
        System.out.println("矩形的面积：" + 面积);
    }
}

class 点类 {
    private int x;
    private int y;
    
    public 点类(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}

class 矩形类 {
    private 点类 topLeft;
    private 点类 bottomRight;
    
    public 矩形类(点类 topLeft, 点类 bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    
    public int 计算周长() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return 2 * (width + height);
    }
    
    public int 计算面积() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }
}


