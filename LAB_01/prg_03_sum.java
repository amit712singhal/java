//Program to accept two integers as inputs and print their sum:

package LAB_01;

import java.util.Scanner;

public class prg_03_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
