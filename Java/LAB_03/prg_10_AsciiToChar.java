//Initialize an integer array with ASCII values and print the corresponding character values in a single row.

package LAB_03;

public class prg_10_AsciiToChar {
    public static void main(String[] args) {
        int[] asciiArray = { 65, 66, 67, 97, 98, 99 }; // Example ASCII values

        System.out.print("Corresponding characters: ");
        for (int asciiValue : asciiArray) {
            System.out.print((char) asciiValue + " ");
        }
    }
}
