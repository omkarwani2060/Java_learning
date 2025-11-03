package Collection_FrameWork.Map.IdenityHashMap;
import java.util.*;

public class Identity1 {
    public static void main(String[] args) {
        String h1 = new String("Omkar");
        String h2 = new String("Omkar");

        HashMap<String ,Integer> hash1 = new HashMap<>();
        hash1.put(h1,101);
        hash1.put(h2,102);
        System.out.println("HashMap : "+hash1);

        IdentityHashMap <String,Integer> iden = new IdentityHashMap<>();
        iden.put(h1, 101);
        iden.put(h2,102);
        System.out.println("IdentityHashMap : "+iden);
    }
}

//HashMap uses .equals() → both keys same → value replaced.
//IdentityHashMap uses == → different references → both stored.