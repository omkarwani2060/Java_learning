package Generics.Method_interface;

public class Static1 {
    static <T> T getval(T[] arr){               // return the value
        return arr[0];
    }
    public static void main(String[] args) {
        Integer[] num = {10,20,30};
        String [] name= {"omkar" , "mahesh" , "Karan"};

        System.out.println(getval(num));
        System.out.println(getval(name));
    }
}
