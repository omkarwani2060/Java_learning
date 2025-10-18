package File_handling.WriteFile_class;

import java.io.PrintWriter;

public class PrintWriter1 {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("C:\\Users\\Lanovo\\Documents\\PrintWrite2.txt");
            pw.write("The file is the Printwrite class use crated..");
            pw.close();
            System.out.println("file created..");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
