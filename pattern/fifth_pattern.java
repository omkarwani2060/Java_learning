package pattern;

import java.util.Scanner;

public class fifth_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=(n+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
