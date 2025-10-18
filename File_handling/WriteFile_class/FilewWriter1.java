package File_handling.WriteFile_class;
import java.io.*;

public class FilewWriter1 {
//    public FilewWriter1(String s) {
//    }

    public static void main(String[] args) {
        try {
        FileWriter fw = new FileWriter("C:\\Users\\Lanovo\\Documents\\FileWriter1.txt");
        fw.write("The file created by FileWriter Class ..");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("File create");
    }
}
