//Program to find ASCII code of a character:

package LAB_01;

import java.util.Scanner;

public class prg_02_ascii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        int asciiValue = (int) inputChar;
        System.out.println("ASCII code of " + inputChar + " is: " + asciiValue);

        scanner.close();
    }
}
