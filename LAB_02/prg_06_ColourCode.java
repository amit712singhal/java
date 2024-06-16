//Write a program to receive a colour code from the user (an Alphabet).

package LAB_02;

import java.util.Scanner;

public class prg_06_ColourCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a colour code (Alphabet): ");
        char colorCode = scanner.next().charAt(0);

        System.out.println("Entered colour code: " + colorCode);

        scanner.close();
    }
}