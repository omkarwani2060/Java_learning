package Recursion;

public class Sum {
    static int sum(int n){
        if(n > 0){
            return n + sum(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
