//WAP to accept name & age of a person from the user. Ensure that entered age is between 15 & 60. Display proper error message & the program must execute gracefully after displaying the error message in case the argument pass is not proper.

package LAB_07;

import java.util.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class prg_28_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String name;
        int Age;
        try {
            System.out.print("Enter your Name -> ");
            name = sc.nextLine();
            System.out.print("Enter your Age -> ");
            Age = sc.nextInt();
            System.out.println();
            if (Age < 15) {
                throw new MyException(name + " Age is " + Age + " Which Is Less Than 15 Years");

            } else if (Age > 60) {
                throw new MyException(name + " Age is " + Age + " Which Is More Than 60 Years");

            } else {
                System.out.println(name + " Age is ::: " + Age);

            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        } finally {
            System.out.println("Finally Program is Finished...");
            System.out.println();
            sc.close();
        }
    }
}
