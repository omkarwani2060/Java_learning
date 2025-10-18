package File_handling.File_rename;
import java.io.*;

public class Rename1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Lanovo\\Documents\\Info.txt");
        File r = new File("C:\\Users\\Lanovo\\Documents\\Info2.txt");

        try{
            if(f.exists()){
                System.out.println(f.renameTo(r));
                System.out.println("File name is change...");
            }
            else{
                System.out.println("File does not exists");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
