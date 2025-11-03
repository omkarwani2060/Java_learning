package Collection_FrameWork.Queue;
import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {

        Queue <Integer> queue = new PriorityQueue<>();
        queue.offer(23);
        queue.offer(12);
        queue.offer(10);
        queue.add(27);
        queue.offer(13);
        System.out.println(queue);      // not Sorted

        while(!queue.isEmpty()){            // Natural Ordering (Sorted first for lowest number)
            queue.poll();
            System.out.println(queue);
        }
    }
}
