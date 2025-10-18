package File_handling.file_create;

import java.io.File;
import java.io.IOException;

public class first {
    public static void main(String[] args) throws IOException {         //throws exception handling
        File f = new File("C:\\Users\\Lanovo\\Documents\\Demo1");       //craate object
        if(f.createNewFile()){
            System.out.println("File created by Successfully...");
        }
        else{
            System.out.println("File already Exists..");
        }
    }
}
