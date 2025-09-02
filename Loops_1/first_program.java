
// find the sum of the following series.
package Loops_1;
import java.util.Scanner;
public class first_program {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a =  sc.nextInt();
            int store = 0;
            for(int i= 1; i <= a; i++){
                if(i % 2 == 0){             // 4 % 2 == 0
                   store -= i;               // store = store - i;
                } else
                    store += i;                 // store = store + i;

            }System.out.println(store);
        }
}
