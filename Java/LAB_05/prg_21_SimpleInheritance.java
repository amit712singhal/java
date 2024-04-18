//Illustrate Simple Inheritance:

package LAB_05;

class Parent {
    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class");
    }
}

public class prg_21_SimpleInheritance {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.display(); // Accessing method from the parent class
        childObj.show(); // Accessing method from the child class
    }
}
