package Recursion;

public class example2 {

    static void  print(int b){
       if (b == 0){
           return;
       }
        print (b - 1);
        System.out.println(b);


    }
    public static void main(String[] args) {
        print(10);
    }
}
