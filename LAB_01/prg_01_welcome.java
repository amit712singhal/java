//Program to accept a String as a command-line argument and print a Welcome message:

package LAB01;

public class prg_01_welcome {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Welcome " + name);
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }
}
