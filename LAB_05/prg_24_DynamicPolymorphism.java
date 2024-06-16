//WAP to Show Dynamic Polymorphism and Interface Overriding:

package LAB_05;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class prg_24_DynamicPolymorphism {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw(); // Calls Circle's implementation of draw()
        rectangle.draw(); // Calls Rectangle's implementation of draw()
    }
}

