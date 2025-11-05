package JAVA_8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

                              // Consumer //
      //  accepts a single input argument and returns no result.
//  It is often used with lambda expressions and Stream API to process elements.

public class ConsumerDemo {
    public static void main(String[] args) {

        //Square
        Consumer<Integer> num = number -> System.out.println(number * number);
        num.accept(10);

        // forEach loop
        List<String> list = Arrays.asList("Omkar", "Mahesh", "Ganesh", "Vishal");
        Consumer<List<String>> name = val -> {
        for (String i : val) {
            System.out.print(i + "   ");
        }
    };
//        name.accept(Arrays.asList("Omkar","Mahesh","Ganesh"));
        name.accept(list);
    }

}
