//Initialize two-character variables in a program and display the characters in alphabetical order.

package LAB_02;

public class prg_05_CharacterOrder {
    public static void main(String[] args) {
        char char1 = 'b';
        char char2 = 'a';

        System.out.println("\nCharacters in alphabetical order:");
        if (char1 < char2) {
            System.out.println(char1 + " " + char2);
        } else {
            System.out.println(char2 + " " + char1);
        }
    }
}
