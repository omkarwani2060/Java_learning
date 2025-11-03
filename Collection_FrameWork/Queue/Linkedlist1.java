package Collection_FrameWork.Queue;
import java.util.*;

public class Linkedlist1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
//        q1.add(1);
        q1.offer(3);        //add the element

        System.out.println("Linked List : "+q1);
        System.out.println(q1.peek());      // access the Head element
        System.out.println(q1.element());       // access Head element & Throws Exception in empty queue.

        System.out.println(q1.remove());        // delete element   //throws exception if empty
        System.out.println(q1.poll());          // delete element  // null

    }
}
