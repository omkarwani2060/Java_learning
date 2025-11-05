package JAVA_8.Method_referunce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class methodDemo {
    public static void main(String[] args) {
        List<String> student = Arrays.asList("Omkar","Ram","Vijay","Sham");
    //    student.forEach(x -> System.out.println(x));        //forEach loop lambda

        student.forEach((System.out::println));     // method Referunce


        Supplier<Boys> boy = Boys::new;         // Constructor Referunce
        boy.get();

                                                  // By Static method
        Consumer<String> obj = Boys::hello;
        obj.accept("hello i am Omkar");


        Boys obj1 = new Boys();                 // Instance Method of a Particular Object
        Supplier<String> ref = obj1:: dis;
        System.out.println(ref.get());

    }

}
class Boys{
    Boys(){
        System.out.println("ONly Boyz..! ");
    }

    public static void hello(String val){
        System.out.println(val);
    }

    String dis(){
        return "Hello Omkar Wani \n Good Morning.";
    }

}