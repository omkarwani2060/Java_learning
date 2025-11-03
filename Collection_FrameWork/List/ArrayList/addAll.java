package Collection_FrameWork.List.ArrayList;

import java.util.*;

public class addAll {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Omkar");
        list.add("Mahesh");
        list.add("ganesh");

        List<String> list1 = Arrays.asList("Vijay", "hari" , "jay" , "mayur");

        list.addAll(list1);         // ADD BOTH LIST
        System.out.println(list);
    }

}
