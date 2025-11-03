package Collection_FrameWork.Map.LinkedHashmap;
import java.util.*;

public class linkedhashmap1 {
    public static void main(String[] args) {
        LinkedHashMap <Integer ,String> student = new LinkedHashMap<>(17,0.80f,true);

        student.put(10, "Omkar");
        student.put(11, "Ajit");
        student.put(12, "Vijay");
        student.put(13, "Raj");
        student.put(14, "Ganesh");

        System.out.println(student);

        System.out.println(student.get(12));    // access the value then accessOrder are last add value.

        System.out.println(student);
        System.out.println(student.getOrDefault(11,"null"));  // the value present then present value
        System.out.println(student.getOrDefault(16,"null"));  // value absent then print null

        System.out.println(student.putIfAbsent(14,"lala"));
        System.out.println(student.putIfAbsent(18,"lala"));

        for(Map.Entry<Integer, String> i : student.entrySet()){
            System.out.println(i);
        }



    }
}
