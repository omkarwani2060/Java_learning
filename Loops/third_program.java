// reverse the digit of number.

package Loops;
import java.util.Scanner;

public class third_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rvrs = 0;
        while(num>0){
            rvrs = (rvrs*10 + num%10);
            num = num /10;
        }
        System.out.println("The reverse number is: "+rvrs);
    }
}
