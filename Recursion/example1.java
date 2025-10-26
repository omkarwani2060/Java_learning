package Recursion;

public class example1 {
    public static int num(int n){
        if (n == 1){
            return 1;
        }
        System.out.println(n);
        return num(n-1);
    }
    public static void main(String[] args) {

        int store = num(10);
        System.out.println(store);
    }
}
