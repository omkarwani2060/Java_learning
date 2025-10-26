package Recursion;

public class Void_Return_type {
     static int sum = 0;
     public static void add(int b){
         if( b == 0){
             System.out.println("The Sum of B NUmber is :- "+ sum);
             return;
         }
         sum += b;
         add(b-1);
    }
    public static void main(String[] args) {
        add(10);
    }
}
