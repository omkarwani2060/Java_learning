package Recursion;

public class void_fact{
    static int fact =1;
    static void facto(int n){
        if(n == 0){
            System.out.println("Factorial : "+ fact);
            return;
        }
        fact *= n;
        facto(n-1);
    }
    public static void main(String[] args) {
        facto(5);
    }
}
