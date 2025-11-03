package Collection_FrameWork.List.Linked_list;
import java.util.*;

public class Linked_list2 {
    public static void main(String[] args) {

        List <String> list = new LinkedList<>();
        list.add("Omkar");                          // add method
        list.add("Ganesh");
        list.add("Vijay");
        list.add("nagu");

        System.out.println("Linked List :- "+list);         // print linked list

        list.addFirst("karan");                 // beginning of method
        list.addLast("jaydeep");                // last of method
        list.add("jay");                        // but "jay" print in last

        System.out.println(list);           // print list

        System.out.println(list.getLast());             // last value are access
        System.out.println(list.get(2));            // access the second index..

        list.remove(1);                 // remove 1 index value :- Omkar
        list.remove("nagu");                // remove "nagu" value.

        System.out.println(list);       // after remove list

        System.out.println(list.size());        // show the size of linked_list

        list.set(0,"Ajay");
        System.out.println(list);               // index 0 are replace value are :- Ajay

        // using loop for of print value

        for(String a : list){
            System.out.print(a + "  ..  ");
        }



    }
}
