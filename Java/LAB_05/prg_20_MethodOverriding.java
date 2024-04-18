//Implement Method Overriding:

package LAB_05;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class prg_20_MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Calls the overridden method in Dog class
    }
}
