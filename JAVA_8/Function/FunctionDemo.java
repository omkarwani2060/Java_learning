package JAVA_8.Function;

import java.util.function.Function;
// Function : Function<T, R> is a functional interface that takes one
//                  argument of type T and returns a result of type R.


public class FunctionDemo {
    public static void main(String[] args) {
        Function <String,Integer> Strlength = str -> str.length();
        System.out.println("Length : "+ Strlength.apply("Omkar"));

        Function<String,String> dd = str -> str.toUpperCase();
        System.out.println("Uppercase :"+dd.apply("omkar"));

        Function<Integer,Integer> sqrt = num -> num * num;
        System.out.println("Square : "+ sqrt.apply(3));
    }
}
