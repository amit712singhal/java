// Illustrate All Uses of super Keyword:

package LAB_05;

class Base {
    int x = 10;

    void display() {
        System.out.println("This is the Base class");
    }
}

class Derived extends Base {
    int x = 20;

    void show() {
        int x = 30;
        System.out.println("Local variable x: " + x);
        System.out.println("Derived class variable x: " + this.x);
        System.out.println("Base class variable x: " + super.x);
        super.display(); // Calls the method from the Base class using super
    }
}

public class prg_23_SuperKeyword {
    public static void main(String[] args) {
        Derived derivedObj = new Derived();
        derivedObj.show();
    }
}
