package File_handling.WriteFile_class;
import java.io.*;

public class Bufferwrite1 {
    public static void main(String[] args) throws Exception{
     BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lanovo\\Documents\\BufferWriter2.txt"));
     bw.write("This is BufferWrite class ..");
     bw.close();
        System.out.println("File create..");
    }
}
