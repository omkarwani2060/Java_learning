package Recursion;

public class sum_of_digit {
    static int sd(int digit){
        if(digit == 0){
            return 0;
        }
        return (digit % 10) + sd(digit / 10);
    }
    public static void main(String[] args) {
        System.out.println("Digit Of Sum :-> "+sd(1020304));
    }
}
