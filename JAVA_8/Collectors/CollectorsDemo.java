package JAVA_8.Collectors;

import Collection_FrameWork.Set.HashSet;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static <Hashmap> void main(String[] args) {

        // Collector toList
        List<String> list = Arrays.asList("Omkar","mahesh","ganesh","mahavir","sham");
        List<String> res = list.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
        System.out.println(res);

        // Collector toSet
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);

        // Collector  to a Specific Collection
        LinkedList<String> collect = list.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(collect);

        // collector Joining String
        String val = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(val);

        // Summarizing Date
        //Generalate Statistical summary(Count, sum, min ,max , avg);
        List<Integer> l1 = Arrays.asList(2,1,4,2,3);
        var collect1 = l1.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count : "+collect1.getCount());
        System.out.println("Avg :" + collect1.getAverage());
        System.out.println("Min : "+ collect1.getMin());
        System.out.println("Max : "+ collect1.getMax());
        System.out.println("Sum : " + collect1.getSum());

        // Grouping Element
        List<String> element = Arrays.asList("java","Python","c++","c","javascript");
        Hashmap collect2 = (Hashmap) element.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collect2);

        // partitioning element
        // parttioning element into two group (False ,True) base on predecate.
        System.out.println(element.stream().collect(Collectors.partitioningBy(x -> x.length() > 3)));


        // ToMap element
        element.stream().collect(Collectors.toMap(x -> x.length(), x -> x.toUpperCase()));


        // Example -> Collecting names by length.
        List<String> lang = Arrays.asList("java","Python","c++","c","javascript","HTML");
        System.out.println("Example1 :- "+lang.stream().collect(Collectors.groupingBy(x -> x.length())));

        // Example -> Counting word
        String word = "hello world java hello world";
        System.out.println(Arrays
                .stream(word.split(" "))
                .collect(Collectors.groupingBy(x -> x,Collectors
                        .counting())));

        // example :-> Partitional even and odd
        List<Integer> num = Arrays.asList(2,4,83,21,43,56);
        var collect3 = num.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect3);

        //Summing value in a map
        HashMap <String,Integer> hash = new HashMap<>();
        hash.put("omkar",30);
        hash.put("mahesh",20);
        hash.put("ganesh",40);
        System.out.println(hash.values().stream().collect(Collectors.summingInt(x -> x)));

        //Example :-> Creating a map From Stream element
        List<String> friut = List.of("Apple","Banana","Mongo","Graphs");
        System.out.println("Length of elements : "+friut.stream()
                .collect(Collectors.toMap(String::toUpperCase, String::length)));

        //Example -> Element count
        List<String> word2 = Arrays.asList("Apple","Banana","Mongo","Banana","Apple","Apple");
        System.out.println("how Many Fruits : "+
                word2.stream()
                .collect(Collectors.toMap(x -> x,v-> 1, Integer::sum)));


    }
}
