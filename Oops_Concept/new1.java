package Oops_Concept;


import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int store = 0;
        while(0 < a){
            store = ( a%10);
            a/= 10;
            System.out.print(store);
        }
    }
}
