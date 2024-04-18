//Write a Java program to produce the tokens from the given long string.

package LAB_03;

import java.util.StringTokenizer;

public class prg_14_Tokenizer {
    public static void main(String[] args) {
        String longString = "This is a long string with multiple words.";

        StringTokenizer tokenizer = new StringTokenizer(longString);

        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
