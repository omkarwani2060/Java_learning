package Collection_FrameWork.Map.ConCurrentMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashmap1 {
    public static void main(String[] args) {
        ConcurrentMap <Integer,String> cm = new ConcurrentHashMap<>();
        cm.put(11,"Dog");
        cm.put(12,"Cat");
        cm.put(13,"lion");
        cm.put(14,"Fox");
        cm.put(15,"cow");
        System.out.println(cm);
        System.out.println(cm.get(12));
        System.out.println(cm.replace(14,"Ox"));
        System.out.println(cm.getOrDefault(16,"Horse"));
        System.out.println(cm);
        cm.remove(15);
        System.out.println(cm);

    }
}
