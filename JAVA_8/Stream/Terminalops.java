package JAVA_8.Stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminalops {
    public static void main(String[] args) {

        // 1. collect
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));
        System.out.println(list.stream().skip(1).toList());

        // 2. for Each
        list.stream().forEach(x -> System.out.println(x));
        list.stream().forEach(System.out::println);

        // 3. reduce -> Combines element to produce a single result
        list.stream().reduce((x,y) -> x+y);
        Optional<Integer> optional_val= list.stream().reduce(Integer::sum);
        System.out.println(optional_val);

        // 4. count
        System.out.println(list.stream().count());

        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        var b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        var b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //6. findFirst  findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7.Min|Max value find
        System.out.println("Max : "+Stream.of(38,29,10).max((o1,o2)-> o1-o2).get());
        System.out.println("MIN : "+ Stream.of(20,10,42,65).min(Comparator.naturalOrder()).get());

        // 8. flatmap
        List<String> l1 = Arrays.asList("Omkar Wani",
                                "Mahesh lakhe",
                "Ganesh gonde",
                "Siniya Kapoor");
        System.out.println(l1.stream()
                .flatMap(val -> Arrays.stream(val.split("  ")))
                .map(String::toUpperCase)
                .toList());

        // Stream can not be used after a terminal operation has been called.

        //Example
        // greatest than 3 length
        List<String> list1 = Arrays.asList("Omkar","jay","raja","praja");
        System.out.println(list1.stream().filter(x -> x.length() > 3).toList());

        // print less than 10 number
        int[] arr = {1,2,3,4,56,4};
        System.out.println(Arrays.toString(Arrays.stream(arr).filter(x -> x < 10).toArray()));

        // Squaring and sorting Number
        List<Integer> l = Arrays.asList(2,8,3,9,5,1);
        var list2 = l.stream().sorted().map(x -> x * x).toList();
        System.out.println(list2);

        //Example :- Summing values
        List<Integer> val = Arrays.asList(10,20,30,40);
        var i = val.stream().reduce(Integer::sum).get();
        System.out.println(i);

        //Counting Occurrence of a character
        List<String> name =Arrays.asList("Parya","pirya","ganya","rajya");
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x =='l').count());

    }

}
