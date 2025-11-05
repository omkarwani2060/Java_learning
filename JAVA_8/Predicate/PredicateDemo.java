package JAVA_8.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        //Predicate  --> Functional interface (Boolean valued function)

        Predicate<Integer > predicate =  n -> n % 2 == 0;
        System.out.println(predicate.test(4));

        Predicate<String> isWordStartingWith = x -> x.toUpperCase().startsWith("O");
        Predicate<String> isWordEndingWith = x -> x.toUpperCase().endsWith("R");
        Predicate word = isWordStartingWith.and(isWordEndingWith);

        System.out.println(isWordStartingWith.test("Omkar"));
        System.out.println(isWordEndingWith.test("Mahesh"));
        System.out.println(word.test("OMKAR"));

        // return only Boolean value --> true , false.
    }
}
