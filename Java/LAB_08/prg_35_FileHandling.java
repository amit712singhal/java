//WAP that read & write in the file.

package LAB_08;

import java.io.*;
import java.util.*;

public class prg_35_FileHandling {
    public static void main(String args[]) {
        try {
            File myFile = new File("D:\\Admin\\B.Tech\\LAB-WORK\\Java\\LAB_09\\prg_35_FileHandling.txt");
            myFile.createNewFile();
            FileWriter WriteFile = new FileWriter("D:\\Admin\\B.Tech\\LAB-WORK\\Java\\LAB_09\\prg_35_FileHandling.txt");
            WriteFile.write("Hello, I Am Amit Singhal\nI Am 18 Years Old\n");
            WriteFile.write("Java is my Favourite Subject");
            WriteFile.close();
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            myFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}