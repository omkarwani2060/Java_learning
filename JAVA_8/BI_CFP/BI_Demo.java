package JAVA_8.BI_CFP;

import java.util.Objects;
import java.util.function.*;


public class BI_Demo {
    public static void main(String[] args) {
        // BiPredicate BiFunction BiConsumer //
    //     take two input arguments instead of one.


        // BiPredicate <T t, U u>
        // two inputs and returns a boolean value (true or false).

        BiPredicate<String, Integer> checkLength = (name, len) -> name.length() == len;
        System.out.println(checkLength.test("omkar",5));
        System.out.println(checkLength.test("Raju",3));

        BiPredicate<Integer,Integer> NumEqual = Objects::equals;
        System.out.println(NumEqual.test(20,20));
        System.out.println(NumEqual.test(20,21));


        // BiConsumer
        // two input arguments and returns nothing (void).

        BiConsumer<String ,Integer> val =   (name,age)-> System.out.println("My Name is "+name+" and age is "+ age+".");
        val.accept("OMKAR",20);

        BiConsumer<Integer,Integer> multiplecation = (a,b) -> System.out.println("Multiplication is: "+ a*b);
        multiplecation.accept(2,9);


        // BiFunction
        //  It takes two inputs and returns a result of type R.

        BiFunction <String,String,Integer> len = (a,b) -> (a+b).length();
        System.out.println(len.apply("omkar","wani"));

        BiFunction<String ,String,String> val1 = (v1,v2) -> v1.concat(v2);
        System.out.println(val1.apply("om","kar"));


        // UnaryOperator in Function
        UnaryOperator<Integer> a = (x) -> x * 2;
        System.out.println(a.apply(3));

        // BinaryOperator in Function
        BinaryOperator<Integer> b = (x,y) -> x +y;
        System.out.println(b.apply(3,6));
    }
}
