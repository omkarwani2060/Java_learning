package method;
import java.util.Scanner;

class work{
    int a;
    int b;

    work(int x, int y){
        System.out.println("constructor work");
        a =x;
        b=y;
    }
    int sum(){
        return a + b;
    }
    int mul(){
        return a * b;
    }
    int div(){
        return  a/b;
    }
}

public class Constructor1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        work obj = new work(x, y);
        System.out.println(obj.sum());
        System.out.println(obj.mul());
        System.out.println(obj.div());
    }
}