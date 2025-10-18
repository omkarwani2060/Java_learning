package File_handling.File_Read_Class;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lanovo\\Documents\\FileOutputstream.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
