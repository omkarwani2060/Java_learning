package num_system;
import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int store = 0;
    int power = 1;
    for (;num > 0;) {
        int unit = num % 2;
        store += unit * power;
        power *= 10;
        num/=2;
    }
        System.out.println(store);
    }
}