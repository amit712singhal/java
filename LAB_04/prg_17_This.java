//Write a program to display the use of this keyword:

package LAB_04;

public class prg_17_This {
    private int value;

    // Parameterized constructor using this keyword
    public prg_17_This(int value) {
        this.value = value;
    }

    // Method using this keyword
    public void displayValue() {
        System.out.println("Value: " + this.value);
    }

    public static void main(String[] args) {
        // Create an object of the class
        prg_17_This obj = new prg_17_This(42);

        // Call the method to display the value
        obj.displayValue();
    }
}

