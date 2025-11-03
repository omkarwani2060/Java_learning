package Collection_FrameWork.List.ArrayList;

import java.util.*;

public class list_to_arrays {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Object[] arr = list.toArray();
        Integer[] arr2 = list.toArray(new Integer[0] );

        for(Object a : arr){
            System.out.println(a);
        }

        for(Integer a : arr2){
            System.out.print(a + "  ");
        }
        System.out.println();



    }
}
