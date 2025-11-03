package Collection_FrameWork.Set;
import java.util.*;

public class LinkedSet {
    public static void main(String[] args) {

        LinkedHashSet <String> l1 = new LinkedHashSet<>();
        l1.add("Omkar");            //Maintains insertion order.
        l1.add("Mahesh");
        l1.add("Ganesh");
        l1.add("Vijay");
        l1.add("vir");
        l1.add("Omkar");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.contains("Ganesh"));
        System.out.println(l1.isEmpty());
        System.out.println(l1.remove("Vijay"));
        System.out.println(l1.getClass());
    }
}
