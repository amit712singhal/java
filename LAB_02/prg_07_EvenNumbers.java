//Write a program to print even numbers between 23 and 57.

package LAB_02;

public class prg_07_EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 23 and 57:");
        for (int i = 23; i <= 57; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            } else
                continue;
        }
    }
}