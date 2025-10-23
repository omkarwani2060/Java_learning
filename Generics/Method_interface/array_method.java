package Generics.Method_interface;

public class array_method {

    static <T> void  m1(T[] array){                 // array print in generics
        for(T a : array){
            System.out.print(a + "    ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        String[] arr2 = {"dada","bhau","shet","don"};

        m1(arr);
        m1(arr2);
    }
}
