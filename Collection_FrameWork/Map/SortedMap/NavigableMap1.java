package Collection_FrameWork.Map.SortedMap;
import java.util.*;

public class NavigableMap1 {
    public static void main(String[] args) {

        NavigableMap<Integer,String> nav = new TreeMap<>();


        nav.put(25,"vijay");
        nav.put(31,"mahadev");
        nav.put(21,"Omkar");
        nav.put(89,"jay");
        nav.put(67,"karan");

        System.out.println(nav);            // default asceding order wise print
        System.out.println(nav.ceilingEntry(36));   //return the your key grater key and equal key.
        System.out.println(nav.descendingMap());      //print descending order
        System.out.println(nav.floorEntry(24)); //return your keys lower key and equal key print.
        System.out.println(nav.lowerKey(56));
        //return your keys lower key and equal key print same work on floorEntry()  ;

        System.out.println(nav.higherEntry(12));   //higher value of this values upper

        System.out.println(nav.navigableKeySet());    // only keys

        System.out.println(nav.pollFirstEntry());   // Lowerest value removes
        System.out.println(nav.pollLastEntry());    //Greatest value    removes

        System.out.println(nav.reversed());     //reversed tree print

    }
}
