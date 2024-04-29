package 作业2;
import java.util.Scanner;

public class 计算直体体积 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int baseType = scanner.nextInt();
            double volume = 0.0;
            
            if (baseType == 0) {
                double radius = scanner.nextDouble();
                double height = scanner.nextDouble();
                volume = calculateCylinderVolume(radius, height);
            } else if (baseType == 1) {
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                double height = scanner.nextDouble();
                volume = calculateTriangularPrismVolume(side1, side2, side3, height);
            } else if (baseType == 2) {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                volume = calculateRectangularPrismVolume(length, width, height);
            }
            
            System.out.printf("%.2f%n", volume);
        }
        scanner.close();
    }
    
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    
    public static double calculateTriangularPrismVolume(double side1, double side2, double side3, double height) {
        double baseArea = calculateTriangleArea(side1, side2, side3);
        return baseArea * height;
    }
    
    public static double calculateRectangularPrismVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

