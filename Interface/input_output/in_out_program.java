package Interface.input_output;
import java.util.Scanner;

interface client{
    void input();       //public + abstract
    void output();
}
public class in_out_program implements client{
    String name ; int sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
         name =  sc.nextLine();

        System.out.println("Enter your name : ");
        sal =  sc.nextInt();
    }
    public void output(){
        System.out.print("name : " + name + "    " );
        System.out.println("salary : " + sal);
    }
    public static void main(String[] args) {

        client io = new in_out_program();
        io.input(); io.output();
    }
}
