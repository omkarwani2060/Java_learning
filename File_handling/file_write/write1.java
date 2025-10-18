package File_handling.file_write;

import java.io.*;

public class write1 {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\Lanovo\\Documents\\Write1.txt");

            try {
                f.write("Hello , He is Don!..");

            }
            finally {
                f.close();
            }
            System.out.println("File create ..");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
