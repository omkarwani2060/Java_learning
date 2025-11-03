package Collection_FrameWork.Map.LinkedHashmap;
import java.util.*;

public class LRU_CACHE<K,V> extends LinkedHashMap<K,V>{
    Integer Capacity;
    LRU_CACHE(Integer Capacity){
        super(Capacity,0.75f,true);
            this.Capacity = Capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > Capacity;
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lru = new LRU_CACHE<>(3);
        lru.put(101,"Omkar");
        lru.put(102,"ganesh");
        lru.put(103,"Karan");
        lru.put(104,"Rajesh");

        lru.get(101);

        System.out.println(lru);        //print only capacity 3 value are
                                    // the size() > capacity are check then capacity are high after the last
                        //capacity initial value are assign you the print that element...
        // LRU_CACHE //


    }
}
