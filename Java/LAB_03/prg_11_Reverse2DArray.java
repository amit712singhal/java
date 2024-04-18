//Write a program to reverse the elements of a given 2*2 array. Four integer numbers need to be passed as Command-Line arguments.

package LAB_03;

public class prg_11_Reverse2DArray {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide exactly 4 integers as command-line arguments.");
            return;
        }

        int[][] matrix = { { Integer.parseInt(args[0]), Integer.parseInt(args[1]) },
                { Integer.parseInt(args[2]), Integer.parseInt(args[3]) } };

        System.out.println("Original 2*2 Array:");
        print2DArray(matrix);

        System.out.println("Reversed 2*2 Array:");
        reverse2DArray(matrix);
        print2DArray(matrix);
    }

    private static void reverse2DArray(int[][] array) {
        int temp = array[0][0];
        array[0][0] = array[1][1];
        array[1][1] = temp;

        temp = array[0][1];
        array[0][1] = array[1][0];
        array[1][0] = temp;
    }

    private static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
