package pattern;
import java.util.Scanner;

public class eleventh_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--) {
                System.out.print(l);
            }
            System.out.println();
            }
        }
    }
