package Collection_FrameWork.Map.Hashmap;

import java.util.*;

public class hash2  {
    public void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<>();

        h1.put(20, "omkar");
        h1.put(21, "Mahesh");
        h1.put(23, "kartik");
        h1.put(11,"Om");
        h1.put(12,"hari");

        System.out.println(h1);

        System.out.println(h1.values());
        System.out.println(h1.keySet());

        h1.remove(23);
        System.out.println(h1);

        System.out.println(h1.containsKey(12));

        System.out.println(h1.get(20));

        Object h3  =  h1.clone();
        System.out.println(h3);

        h1.replace(21,"Mahesh", "Jagadeesh");
        

        for(Map.Entry<Integer, String> i : h1.entrySet()){
            System.out.print(i.getKey() + " : " + i.getValue() + "  ");
        }




        HashMap <Integer , String> h2 = new HashMap<>(20);      // custom initial capacity


    }
}
