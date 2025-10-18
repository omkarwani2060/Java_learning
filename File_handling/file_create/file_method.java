package File_handling.file_create;

import java.io.File;
import java.util.Arrays;

public class file_method {
    public static void main(String[] args) throws Exception{

        File f = new File("C:\\Users\\Lanovo\\Documents\\method.txt");

        if(f.exists()){
            System.out.println("File Name : " + f.getName());
            System.out.println("File Path : " + f.getAbsolutePath());
            System.out.println("File Read : " + f.canRead());
            System.out.println("File Write: "+ f.canWrite());
            System.out.println("File length : "+ f.length());
            System.out.println("File Type :  "+f.isFile());     // the value return true and false
            System.out.println("File List : " +Arrays.toString(f.list()));      // list all file show
          //  System.out.println("File Delete : " + f.delete());
        }
        else {
            f.createNewFile();
            System.out.println("File Create..");           // Create File
        }
    }
}

