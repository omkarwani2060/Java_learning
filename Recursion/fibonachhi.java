package Recursion;

public class fibonachhi {
    static int fib(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int num = 10;
        for(int i =0 ; i<= num; i++ ){
            System.out.print(fib(i) + "  ");
        }
    }
}
