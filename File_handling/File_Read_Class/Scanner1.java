package  File_handling.File_Read_Class;

import java.io.File;
import java.util.*;

public class Scanner1{
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner( new File("C:\\Users\\Lanovo\\Documents\\FileOutputstream.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception handle...");
        }
    }
}