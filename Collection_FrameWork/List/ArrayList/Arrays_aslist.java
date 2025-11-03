package Collection_FrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Arrays_aslist {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Dog","Cat","Cow","Horse","Cock");
        System.out.println(list1);

        Integer[] arr1 = {1,23,34,21};                   // Convert array to list
        List<Integer> list2 = Arrays.asList(arr1);

        System.out.println(list2);

        //  list2.add(56);                              // throws exception
        // list2.remove(1);                           //throws exception

        list2.set(2, 10);                           // can modified list
        System.out.println("Modified List : " + list2);


        List <String> list3 = new ArrayList<>(Arrays.asList("omkar" , "mahesh" , "ganesh" , "vijay"));
        // If you want to add or remove elements, wrap it in a new ArrayList:

        list3.add("om");                // add in list3
        list3.remove("vijay");          // remove in list3

        System.out.println(list3);
    }
}
