package Collection_FrameWork.Queue.Deque;
import java.util.*;

public class LinkedlistDequedemo {
    public static void main(String[] args) {
        Deque <Integer> ld = new LinkedList<>();
        ld.addFirst(10);
        ld.push(20);
        ld.offerLast(12);
        ld.add(92);

        System.out.println("LinkedList in Deque : "+ld);
        ld.pollLast();
        ld.removeFirst();
        ld.pop();

        System.out.println(ld);

        ld.addFirst(24);
        System.out.println(ld.peek());
        System.out.println(ld.getLast());


        System.out.println("..Iterator..");             //How to iterator in for each loop

        Iterator<Integer> iterator = ld.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
