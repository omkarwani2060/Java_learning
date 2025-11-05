package JAVA_8.Lambda;
import java.util.*;

public class LambdaDEMO {
    public static void main(String[] args) {
        // Lambda  //
        Runnable hello = () -> {
            System.out.println("Hello ");
        };
        hello.run();

        // lambda expression in forEach loop
        String[] name = {"Omkar","garish","Ganesh","Vijay","Ram"};
        Arrays.asList(name).forEach(val -> System.out.print(val + "  ") );
        System.out.println();

        // lambda expression on forEach loop in List
        List<Integer> list = Arrays.asList(1,2,4,5,6,7,8);
        list.forEach(num -> System.out.print(num + "  "));
        System.out.println();


        //Sort names alphabetically using Lambda
        String[] name1 = {"Omkar","garish","Ganesh","Vijay","Ram"};
        Arrays.sort(name1,(a,b) -> a.compareTo(b));
        Arrays.asList(name1).forEach(n -> System.out.print(n + "  "));


    }
}
