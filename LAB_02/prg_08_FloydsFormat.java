//Write a program to print in Floyd's format (using for and while loop).

package LAB_02;

public class prg_08_FloydsFormat {
    public static void main(String[] args) {
        int n = 5; // Change this value for a different number of rows
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}