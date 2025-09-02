// find the sum of digit in a given number n.

package Loops;
import java.util.Scanner;

public class second_program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("number of digits Sum: "+ sum);
    }
}
