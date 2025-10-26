package Recursion;

public class count_digit_number {
    static int count(int num){
        if(num == 0){
            return 0;
        }
        return 1 + count(num / 10);
    }
    public static void main(String[] args) {
        System.out.println("DIGIT : "+ count(102020));
    }
}
