package Collection_FrameWork.Map.SortedMap;
import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        SortedMap<Integer,String> map1 = new TreeMap<>((a,b)->  b - a); // use desceding order use lambda method

        map1.put(10,"Dog");
        map1.put(6,"horse");
        map1.put(18,"cat");
        map1.put(28,"lion");
        map1.put(25,"tiger");
        map1.put(2,"cow");

        System.out.println(map1);

        System.out.println(map1.headMap(18));
        System.out.println(map1.tailMap(18));

        System.out.println(map1.firstKey());
        System.out.println(map1.lastKey());

        System.out.println(map1.subMap(25,2));

        System.out.println(map1.containsKey(28));

        for(Map.Entry<Integer, String> i : map1.entrySet()){        //print iterate
            System.out.println(i.getKey() + " " + i.getValue());
        }


    }
}
