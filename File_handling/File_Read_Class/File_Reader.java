package File_handling.File_Read_Class;

import java.io.FileReader;

public class File_Reader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\Lanovo\\Documents\\FileOutputstream.txt");
            int i = 0;
            while((i = fr.read())!= -1){
                System.out.print((char)i);
            }
            fr.close();
            System.out.println(" ................................");
        }
        catch(Exception e){
            System.out.println("Exception Handle ....");
        }
    }
}
