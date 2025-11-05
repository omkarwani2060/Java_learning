package JAVA_8.Supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

                    // Supplier//
// supplier of results — it does not take any input but returns a value.
public class SupplierDemo {
    public static void main(String[] args) {

        // print message
        Supplier<String> print = () -> "Hello! \nGood Morning.";
        System.out.println(print.get());

        // Random number
       Supplier<Integer> Unknown = () -> new Random().nextInt(100);
        System.out.println("Random Number : "+Unknown.get());
        System.out.println("Random Number : "+Unknown.get());

            // Date and Time
        Supplier<LocalDateTime> Time = () -> LocalDateTime.now();
        System.out.println("Current Time : "+ Time.get());




        // all Combine in program pradicate,functiion,consumer,supplier.

        Predicate<Integer> IsEven = x -> x%2 ==0;
        Function<Integer,Integer> square = a -> a*a;
        Consumer<Integer> val = a -> System.out.println(a);
        Supplier<Integer> num1 = () ->  100;

        System.out.print("Combine of all : ");
        if(IsEven.test(num1.get())){
            val.accept(square.apply(num1.get()));
        }

    }
}
