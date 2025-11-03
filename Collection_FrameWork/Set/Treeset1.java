package Collection_FrameWork.Set;
import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);         //Does not maintain order.
        t.add(1);          // fastest opetion perform.
        t.add(17);
        t.add(16);
        t.add(1);
        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.contains(16));
        System.out.println(t.isEmpty());
        System.out.println(t.remove(17));
        System.out.println(t.getClass());
        System.out.println(t.ceiling(4));
        System.out.println(t.descendingSet());

//        Implements NavigableSet (sorted set).
//        Stores elements in sorted order (natural order or custom comparator).
//        No null values allowed.
//        Backed by a TreeMap (Red-Black Tree).
    }
}
