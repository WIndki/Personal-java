package 实验改.实验3;

public class 图形问题 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Triangle(3, 4, 5);
        shapes[0].setColor("yellow");
        shapes[1].setColor("blue");
        for (Shape shape : shapes) {
            String name;
            if(shape instanceof Circle)
                name = "圆形";
            else if(shape instanceof Triangle)
                name = "三角形";
            else
                name = "未知形状";
            System.out.println(name+"的创建时间："+shape.createdtime);
            System.out.println(name+"的颜色："+shape.getColor());
            System.out.println(name+"的面积：" + shape.area());
            System.out.println(name+"的周长：" + shape.perimeter());
        }
    }
}
abstract class Shape {
    private String color;
    protected String createdtime;
    public abstract double area();
    public abstract double perimeter();

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.createdtime = java.time.LocalDateTime.now().toString();
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.createdtime = java.time.LocalDateTime.now().toString();
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
