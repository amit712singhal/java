//Illustrate Multilevel Inheritance:

package LAB_05;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

class SportsCar extends Car {
    void turboCharge() {
        System.out.println("Sports car turbocharged");
    }
}

public class prg_22_MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sportsCarObj = new SportsCar();
        sportsCarObj.start(); // Accessing method from the Vehicle class
        sportsCarObj.accelerate(); // Accessing method from the Car class
        sportsCarObj.turboCharge(); // Accessing method from the SportsCar class
    }
}
