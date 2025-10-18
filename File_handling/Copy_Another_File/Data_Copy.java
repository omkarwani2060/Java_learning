package File_handling.Copy_Another_File;
import java.io.*;

public class Data_Copy{
    public static void main(String[] args) {
        try {
            FileInputStream r = new FileInputStream("C:\\Users\\Lanovo\\Documents\\Info2.txt");
            FileOutputStream w = new FileOutputStream("C:\\Users\\Lanovo\\Documents\\Infirmation.txt");

            int line;
            while ((line = r.read()) != -1) {
               w.write(line);
                }
            }
            catch(IOException e){
                System.out.println(e);
            }
        System.out.println("File are Copy.");
    }
}
