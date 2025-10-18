package File_handling.File_Read_Class;

import java.io.FileInputStream;

public class FileInputOutStream1 {
    public static void main(String[] args) {
        try{
        FileInputStream fis = new FileInputStream("C:\\Users\\Lanovo\\Documents\\FileOutputstream.txt");
        int i;
        while((i = fis.read()) != -1){
            System.out.print((char) i);
            }
        }
        catch(Exception e){
        System.out.println("handle Exception..");
        }
    }
}
