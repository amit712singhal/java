//Write a program to count the number of instances created for the class:

package LAB_04;

public class prg_18_InstanceCounter {
    private static int instanceCount = 0;

    // Constructor increments the instance count
    public prg_18_InstanceCounter() {
        instanceCount++;
    }

    // Static method to get the instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        // Create instances of the class
        prg_18_InstanceCounter obj1 = new prg_18_InstanceCounter();
        prg_18_InstanceCounter obj2 = new prg_18_InstanceCounter();

        // Get and display the instance count
        System.out.println("Number of instances created: " + prg_18_InstanceCounter.getInstanceCount());
    }
}
