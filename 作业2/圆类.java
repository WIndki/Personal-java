package 作业2;
import java.util.Scanner;
public class 圆类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double radius = sc.nextDouble();
            int centerX = sc.nextInt();
            int centerY = sc.nextInt();
            circle c = new circle(radius, centerX, centerY);
            int deltaX = sc.nextInt();
            int deltaY = sc.nextInt();
            c.move(deltaX, deltaY);
            c.printCircleInfo();
        }
    }
}

class circle{
    private double radius;
    private int centerX;
    private int centerY;

    public circle(double radius, int centerX, int centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void move(int deltaX, int deltaY) {
        centerX += deltaX;
        centerY += deltaY;
    }

    public void printCircleInfo() {
        System.out.printf("area:%.2f perimeter:%.2f after moved:%d %d\n", getArea(), getPerimeter(), centerX, centerY);
    }
}
