package Collection_FrameWork.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_demo {
    public static void main(String[] args) {

        HashMap <Integer ,String> con = new HashMap<>();
        // add the element
        con.put(1,"Omkar");
        con.put(10,"dipak");
        con.put(3,"Vijay");
        con.put(78,"jay");
        con.put(5,"raj");
        con.put(18,"mahavir");
        con.put(200,"karan");
        con.put(null, "mahadev");           // key are null only one time
        con.put(29, null);              // value are null many times

        //print the all element
        System.out.println(con);

        //access the element
        System.out.println(con.get(2));         // the 2 keys are not available
        System.out.println(con.get(10));        //print the value

        //remove the element
        con.remove(5);      // by key initialation
        System.out.println(con);
        con.remove(78,"jay");       // by key and value pair
        System.out.println(con);

        //for each loop
        for(Integer i : con.keySet()){
            System.out.print(i+ "   ");          // print all keys
        }
        System.out.println();


        for(String i : con.values()){
            System.out.print(i+ "   ");             // print all values
        }
        System.out.println();


        for(Map.Entry<Integer, String> i : con.entrySet()){
            System.out.println(i);                      // print all keys and values pair.
        }

        System.out.println(con.containsKey(null));       //check key are present or not //return true / false
        System.out.println(con.containsValue("om"));    //check values are present or not //return true / false



    }
}
