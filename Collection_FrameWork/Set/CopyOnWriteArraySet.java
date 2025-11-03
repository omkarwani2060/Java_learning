package Collection_FrameWork.Set;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class CopyOnWriteArraySet {
    public static void main(String[] args) {

        Set <Integer> s1 = new java.util.concurrent.CopyOnWriteArraySet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);

        for(int i : s1){
            s1.add(6);
            System.out.println("Number : "+ i);
        }
        System.out.println("CopyOnWriteArraySet : "+s1);




        System.out.println("/////    ConcurrentSkipListSet    /////// ");
        // ConCurrentSkipListSet
        Set <Integer> s2 = new ConcurrentSkipListSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        s2.add(5);

        for(int i : s2){
            s2.add(6);
            System.out.println("Number : "+ i);
        }
        System.out.println("ConcurrentSkipListSet : "+s1);


    }

}
