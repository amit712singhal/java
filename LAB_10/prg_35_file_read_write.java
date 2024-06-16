//WAP that read & write in the file.

package LAB_10;

import java.io.*;
import java.util.*;

public class prg_35_file_read_write {
    public static void main(String args[]) {
        try {
            File myFile = new File("./LAB_10/file_handling.txt");
            myFile.createNewFile();
            FileWriter WriteFile = new FileWriter("./LAB_10/file_handling.txt");
            WriteFile.write("Hello, I Am Amit Singhal\nI Am 18 Years Old\nJava is my Favourite Subject");
            WriteFile.close();
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}