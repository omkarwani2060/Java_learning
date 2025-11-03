package Collection_FrameWork.Map.ImmutableMap;
import java.util.*;

public class ImmutableMap1 {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();
        map.put("Gabbar", 20);
        map.put("amitabh", 10);
        map.put("darmendra",11);
        System.out.println("Map1 : "+map);    //print map
        Map<String, Integer> map2 = Collections.unmodifiableMap(map);   // Immutable map
        System.out.println("Map2 : "+map2);

     //   map2.put("Hema",40);    // throws Exception  .UnsupportedOperationException

        //Immutable Map
        Map<String,Integer> map3 = Map.of("Dada",20,"kaka",10,"chacha",30);
            // Only 10 value are add of this method...
 //       map3.put("ye ye",121);  // throws Exception  .UnsupportedOperationException


        Map<String,Integer> map4 = Map.ofEntries(Map.entry("Omkar",1),Map.entry("Mahesh",2),Map.entry("Karan",3));
        // immutable Map        // multiple key & values store
        //       map4.put("ye ye",121);  // throws Exception  .UnsupportedOperationException
    }

}
