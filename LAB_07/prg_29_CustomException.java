//WAP to create a customized exception & also make use of all the 5 exception keywords.

package LAB_07;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class prg_29_CustomException {
    public static void CheckException(String Name, int Age) {
        try {
            Check(Name, Age);
        } catch (MyException e) {
            System.out.println("Error : " + e);
        } finally {
            System.out.println("Finally Program Executed...");
            System.out.println();
        }
    }

    public static void Check(String Name, int Age) throws MyException {
        if (Age < 18) {
            throw new MyException(Name + " Is Not Eligible For Voting");
        } else {
            System.out.println(Name + " Is Eligible For Voting");
        }
    }

    public static void main(String args[]) {
        CheckException("Amit", 21);
        CheckException("Justin", 17);
    }
}
