package Collection_FrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(300);
        list.add(800);
        list.add(5);

        list.sort(null);                        // sort element
//        Collections.sort(list);                   // sort element
        System.out.println(list);
    }
}
