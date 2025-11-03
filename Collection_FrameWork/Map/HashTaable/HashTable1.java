package Collection_FrameWork.Map.HashTaable;
import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {

        Hashtable <Integer ,String> hash1 = new Hashtable<>();
        hash1.put(1,"Omkar");
        hash1.put(27,"Mahesh");
        hash1.put(10,"Ganesh");
        hash1.put(4,"Vijay");
        hash1.put(15,"Om");

        System.out.println(hash1);
        System.out.println(hash1.containsKey(10));
        System.out.println(hash1.values());
        System.out.println(hash1.get(27));
        System.out.println(hash1.remove(15));
        System.out.println(hash1);
        System.out.println(hash1.replace(4,"karan"));
        System.out.println(hash1);
    }
}
