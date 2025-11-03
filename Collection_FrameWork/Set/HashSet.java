package Collection_FrameWork.Set;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

            // set are the Unique element are Store
        Set <Integer> s1 = new java.util.HashSet<>();
        s1.add(10);         //Does not maintain order.
        s1.add(1);          // fastest opetion perform.
        s1.add(17);
        s1.add(16);
        s1.add(1);
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.contains(16));
        System.out.println(s1.isEmpty());
        System.out.println(s1.remove(17));
        System.out.println(s1.getClass());

        for(Integer i : s1){
            System.out.print(i + "   ");
        }



    }
}
