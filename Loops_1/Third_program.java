
// find the raised to power b.

package Loops_1;
import java.util.Scanner;

public class Third_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int store = 1;
        for(int i = 1; i <= b; i++){
             store = store * a;
        }
        System.out.println(store);
    }

}
