//Create a class Box with a parameterized constructor and a method to calculate the volume:

package LAB_04;

public class prg_16_Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public prg_16_Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create an object of the Box class
        prg_16_Box myBox = new prg_16_Box(3.0, 4.0, 5.0);

        // Test the functionalities
        System.out.println("Volume of the box: " + myBox.calculateVolume());
    }
}
