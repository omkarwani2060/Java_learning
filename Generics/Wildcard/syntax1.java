package Generics.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class syntax1 {
    public static void main(String[] args) {

        List<? extends Object> list1 = new ArrayList<Integer>();


        // You can read elements from it
        // But you cannot add new elements (except null)
     //   list1.add(898);         //  But you cannot add new elements (except null);
        list1.add(null);

        List<String> l1 = new ArrayList<>();
        l1.add("omkar");
        l1.add("karan");
        l1.add("mahesh");

        for(String a: l1){                          // all element are print
            System.out.print(a+ "  ");
        }
        System.out.println();


        String a = l1.get(0);                   // You can read elements safely as Object
        System.out.println(a);

    }
}
