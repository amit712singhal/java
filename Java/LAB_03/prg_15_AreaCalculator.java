//Using the concept of method overloading, write methods for calculating the area of a triangle, circle, and rectangle.

package LAB_03;

public class prg_15_AreaCalculator {
    public static void main(String[] args) {
        // Example usage
        System.out.println("Area of Triangle: " + calculateArea(5.324, 8.765));
        System.out.println("Area of Circle: " + calculateArea(3.5));
        System.out.println("Area of Rectangle: " + calculateArea(4, 6));
    }

    // Area of Triangle
    private static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Area of Circle
    private static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    private static double calculateArea(int length, int width) {
        return length * width;
    }
}
