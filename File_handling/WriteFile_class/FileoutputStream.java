package File_handling.WriteFile_class;
import java.io.*;


public class FileoutputStream {
    public static void main(String[] args) {
try{
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Lanovo\\Documents\\FileOutputstream.txt");
    String s = "The File is Create by FileOutputStream Class.";
    fos.write(s.getBytes());
}
catch(Exception e){
    System.out.println(e);
}
        System.out.println("File created..");
    }
}
