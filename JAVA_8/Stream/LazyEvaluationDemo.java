package JAVA_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Omkar", "jay", "Swan", "Don", "Monu");
        Stream<String> val = str.stream().filter(name ->{
            System.out.println("filtering : "+ name);
            return (name.length() > 3);
        });

        System.out.println("Before Termonal Operation : ");

        List<String> result = val.toList();

        System.out.print("After Termonal Operation : ");

        System.out.println(result);


    }
}
