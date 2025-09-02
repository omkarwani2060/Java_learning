package method;
import java.util.Scanner;

class second{
    int add(int a,int b ){
        int c =a +b;
        return c;
    }
}
public class first{
    public static void main(String[] args){
        second obj = new second();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int store = obj.add(x,y);
        System.out.println("Sum of Two number: " + store);
    }
}
