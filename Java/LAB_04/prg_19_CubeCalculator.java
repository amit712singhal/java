//Java program to get the cube of a given number using a static method:

package LAB_04;

public class prg_19_CubeCalculator {
    // Static method to calculate the cube
    public static double calculateCube(double number) {
        return Math.pow(number, 3);
    }

    public static void main(String[] args) {
        // Test the static method
        double result = prg_19_CubeCalculator.calculateCube(4.0);
        System.out.println("Cube of the given number: " + result);
    }
}
