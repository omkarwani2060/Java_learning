package File_handling.File_Read_Class;
import  java.io.*;

public class Array_data {
    public static void main(String[] args) {
    try{
        FileReader fr = new FileReader("C:\\Users\\Lanovo\\Documents\\Write2.txt");
        int i= 0;
        while((i = fr.read())!= -1){
            System.out.print((char)i);
        }
        fr.close();

    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
