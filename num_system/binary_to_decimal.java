package num_system;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int store = 0;
        int power = 1;
        while(num > 0){
            int unit = num %10;
            store += unit * power;
            power *= 2;
            num/= 10;
        }
        System.out.println("binary to decimal: "+store);
    }
}