//WAP that creates an Interface & implements it

package LAB_06;

// Define the interface
interface MyInterface {
    // Abstract method declaration
    void myMethod();
}

// Implement the interface in a class
class MyClass implements MyInterface {
    // Implementing the abstract method from the interface
    public void myMethod() {
        System.out.println("Implementing myMethod() in MyClass");
    }
}

public class prg_26_Interface {
    public static void main(String[] args) {
        // Create an object of the implementing class
        MyClass obj = new MyClass();

        // Call the method implemented from the interface
        obj.myMethod();
    }
}