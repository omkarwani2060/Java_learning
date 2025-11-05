package JAVA_8.Collectors;

import java.util.*;
import java.util.stream.*;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Omkar", "Vijay", "Ganesh", "Ram", "Ganesh");

        // 1️⃣ Collect to List
        List<String> list = names.stream()
                .collect(Collectors.toList());
        System.out.println("List: " + list);

        // 2️⃣ Collect to Set (removes duplicates)
        Set<String> set = names.stream()
                .collect(Collectors.toSet());
        System.out.println("Set: " + set);

        // 3️⃣ Collect to specific Collection (like LinkedList)
        LinkedList<String> linkedList = names.stream()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("LinkedList: " + linkedList);

        // 4️⃣ Count elements
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println("Count: " + count);

        // 5️⃣ Joining elements into a single String
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);

        // 6️⃣ Grouping elements by name length
        Map<Integer, List<String>> groupByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Group by length: " + groupByLength);

        // 7️⃣ Counting occurrences of each element
        Map<String, Long> countByName = names.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Count by name: " + countByName);

        // 8️⃣ Summarizing integers
        IntSummaryStatistics stats = names.stream()
                .map(String::length)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Summary stats: " + stats);

        // 9️⃣ Finding average of numeric values
        double avgLength = names.stream()
                .collect(Collectors.averagingInt(String::length));
        System.out.println("Average name length: " + avgLength);
    }
}

