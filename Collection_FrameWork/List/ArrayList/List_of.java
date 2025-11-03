package Collection_FrameWork.List.ArrayList;

import java.util.List;

public class List_of {
    public static void main(String[] args) {

        List<String> list1 = List.of("Omkar", "mahesh", "ganesh");
        // can not add , remove , modify
        //static factory method used to create an immutable list — that means you cannot modify it (no add, remove, or update).

        System.out.println(list1);
    }
}
