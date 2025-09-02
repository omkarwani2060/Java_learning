// count the number of digit for a given number n.

package Loops;
import java.util.Scanner;
public class first_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int store = 0;
        while(0<a){
              a/= 10;
              store++;
        }
        System.out.println(store);
    }

}
