//WAP to convert the content of a given file into the uppercase content of the same file.

package LAB_10;

import java.io.*;

public class prg_38_file_handling_2 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "./LAB_10/file_handling.txt";

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;

            // Read the content line by line
            while ((line = reader.readLine()) != null) {
                // Convert each line to uppercase and append to StringBuilder
                content.append(line.toUpperCase()).append("\n");
            }
            reader.close();

            // Write the uppercase content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("File content converted to uppercase successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
