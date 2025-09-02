package Loops_1;
import java.util.Scanner;
public class second_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int store = 1;
        for(int i = 1; i <= a; i++){
            store *= i;
        }
        System.out.println(store);
    }
}
