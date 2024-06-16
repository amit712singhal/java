//Swapping two numbers using bitwise operator:

package LAB_01;

public class prg_04_swap {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("\nBefore swapping: a = " + a + ", b = " + b);

        // Using bitwise XOR to swap values without using a temporary variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
