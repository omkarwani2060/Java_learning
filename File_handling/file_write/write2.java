package File_handling.file_write;
import java.io.*;

public class write2 {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("C:\\Users\\Lanovo\\Documents\\Write2.txt");
            f.write("hello Friend ... | ... how are you? \n");
            f.write("my friend told : - I am fine.");
            f.close();
            System.out.println("Create file..");
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
