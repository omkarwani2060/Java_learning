package Collection_FrameWork.List.CopyOnWriteArrayList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
        List <String> l1 = new CopyOnWriteArrayList<>();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Mongo");
        l1.add("Cherry");
        System.out.println("Original array: "+l1);

        // Iterate safely while modifying
        for(String item : l1){
            System.out.println(item);
            if(item.equals("Mongo")){           // check the mongo are available to
                l1.add("Berry");                // add Berry.
            }
        }
        System.out.println(l1);
    }
}
