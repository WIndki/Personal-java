import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float r1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        float r2 = scanner.nextFloat();
        Circle c1 = new Circle(x1, y1, r1);
        Circle c2 = new Circle(x2, y2, r2);
        System.out.println(c1.relation(c1, c2));
        }
        scanner.close();
    }
}

class Circle {
    private float x;
    private float y;
    private float r;

    public Circle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle() {
        this(0, 0, 0);
    }

    public String relation(Circle c1, Circle c2) {
        float distance = (int) Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
        float radiusSum = c1.r + c2.r;
        float radiusDiff = Math.abs(c1.r - c2.r);

        if ( distance > radiusDiff && distance < radiusSum ) {
            return "intersected";
        } else if (distance == radiusSum) {
            return "tangented";
        } else if (distance < radiusDiff ) {
            return "involved";
        } else {
            return "aparted";
        }
    }
}