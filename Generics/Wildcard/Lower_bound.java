package Generics.Wildcard;

import java.util.*;

public class Lower_bound {
    public static void method1(List<? super Integer> list1){
        for(Object a : list1){
            System.out.print(a + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List <Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        method1(l1);
    }
}
