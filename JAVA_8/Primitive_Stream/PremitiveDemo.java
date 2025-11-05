package JAVA_8.Primitive_Stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PremitiveDemo {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(a);
        System.out.println(stream.boxed().collect(Collectors.toList()));

        IntStream.range(1, 5).forEach(x -> System.out.print(x + " "));//without include 5
        System.out.println();
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toSet())); //include 5

        IntStream s1 = IntStream.of(33, 55, 66, 77, 88, 99);
        System.out.println(s1.boxed().toList());

        DoubleStream d1 = new Random().doubles(5);
        System.out.println(String.valueOf(d1.boxed().collect(Collectors.toCollection(LinkedList::new))));

        var ints = new Random().ints(5);
//       ints.forEach(x -> System.out.print(x + "    "));
//        System.out.println(ints.summaryStatistics());
//        System.out.println(ints.sum());
//        System.out.println(ints.max().getAsInt());
        ints.filter(x -> x > 2000).forEach(System.out::println);


//        System.out.println(ints.boxed().allMatch(x -> x%2==0)); // false

        IntStream ab = Arrays.stream(new int[]{22, 44, 3, 2, 1});
        ab.filter(x -> x < 20).forEach(System.out::println);        //same code by near

        int[] new1 = {22, 44, 3, 2, 1};
        for(int i=0; i < new1.length;i++){
           if(new1[i] < 20){
               System.out.println(new1[i]);
           }
        }

        IntStream val = IntStream.of(12,21,53);

        System.out.println(val.boxed().collect(Collectors.toList()));


    }
}