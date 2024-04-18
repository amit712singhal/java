//WAP to create an abstract class "Shape" where "Rectangle" & "Triangle" inherit the "Shape" class.

package LAB_06;

abstract class Shape {
    int Base, Height;

    public abstract void Show();

    public abstract void Area();
}

class Rectangle extends Shape {
    public Rectangle(int b, int h) {
        Base = b;
        Height = h;
    }

    @Override
    public void Show() {
        System.out.println("The Rectangle Has Base = " + Base + " & Height = " + Height);
    }

    public void Area() {
        System.out.println("The Area Of Rectangle is -> " + (Base * Height));
    }
}

class Triangle extends Shape {
    public Triangle(int b, int h) {
        Base = b;
        Height = h;
    }

    @Override
    public void Show() {
        System.out.println("The Triangle Has Base = " + Base + " & Height = " + Height);
    }

    public void Area() {
        System.out.println("The Area Of Triangle is -> " + (0.5 * Base * Height));
    }
}

public class prg_25_AbstractClass {
    public static void main(String args[]) {
        System.out.println();
        Shape s = new Rectangle(10, 20);
        s.Show();
        s.Area();
        System.out.println();
        s = new Triangle(20, 20);
        s.Show();
        s.Area();
        System.out.println();
    }
}
