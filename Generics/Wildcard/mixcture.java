package Generics.Wildcard;
import java.util.*;

public class mixcture {
    // un_Bounded
    public static  void unbounded(List <?> l1){
        System.out.print("UnBounded :- ");
        for(Object a : l1){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    // upper_Bounded
    static  void upperbounded(List <? extends Number> l2){
        System.out.print("UpperBounded :- ");
        for(Object b : l2){
            System.out.print(b + " ");
        }
        System.out.println();
    }
    // Lower_Bounded
    static  void lowerbounded(List <? super Integer> l3){
        System.out.print("LowerBounded :- ");
        for(Object c : l3){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        List <Integer> list1 = Arrays.asList(18,20,30,40,10);
        unbounded(list1);
        upperbounded(list1);
        lowerbounded(list1);

    }

}
