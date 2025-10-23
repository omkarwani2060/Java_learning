package Generics.Wildcard;

import java.util.*;

public class unbounded {

    public static void m1(List<?> l1)
    {
        for(Object a : l1){
            System.out.print(a + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        List <Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        m1(list1);
    }
}
