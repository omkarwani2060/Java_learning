package JAVA_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


// How To Use Stream ?
    //Source, intermediate operation & Terminal Operations

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(number.stream().filter(x -> x%2==0).count());//Count of Even Number Print.
        //2 4 6 8 -> 4

        // Create Collections
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        Stream<Integer> num  = list.stream();
//        System.out.println(num);

        // From Arrays
//        int[] arr ={1,2,3,4,5,6};           // error in program i do not solve error
//        Stream<Integer> stream = (Stream<Integer>) Arrays.stream(arr);
//        System.out.println(stream);


        //1. filter          // count the number of start for the M letter.
        List<String> list1 = Arrays.asList("Omkar","Mahesh","Omkar","Vijay","Mahavir");
        long a = list1.stream().filter(x -> x.startsWith("M")).count();
        System.out.println(a);


        //2. map
        list1.stream().map(x -> x.toUpperCase());   //Function
        list1.stream().map(String::toUpperCase).forEach(System.out::println);        // by Method Reference

        //3. Sorted
        list1.stream().sorted().forEach(System.out::println);
        list1.stream().sorted((a1,b)-> a1.length()-b.length());

        //4. distanct
        System.out.println(list1.stream().filter(x -> x.startsWith("O")).distinct().count());

        //5. limit
        Stream.iterate(1,x -> x+1).limit(15).forEach(System.out::println);

        //6. Skip
        System.out.println("Skip ");
        Stream.iterate(1,x-> x+1).skip(10).limit(20).forEach(System.out::println);

        // 7. peek -> perform an action on element as it is consumed.
        System.out.println("....");
        Stream.iterate(1,x -> x+1).skip(20).limit(10).peek(System.out::println).toList();
    }
}
