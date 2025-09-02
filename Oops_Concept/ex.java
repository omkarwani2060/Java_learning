package Oops_Concept;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for(int i=1; n>0; i++){
            ans=(ans*10+n%10);
            n/=10;
        }
        System.out.println(ans);
    }
}
