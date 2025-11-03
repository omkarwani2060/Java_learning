package Collection_FrameWork.Queue.Deque;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Deque = Queue + Stack
        // all method of Queue and stack are access Deque

        Deque <Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(40);
        deque.offerFirst(200);
        deque.offerLast(34);
        deque.add(29);
        deque.offer(40);
        deque.push(56);             // use the push operation

        System.out.println("Array Deque : "+deque);

        System.out.println(deque.getFirst());       // access the first element
        System.out.println(deque.peek());            // access the first


        deque.removeFirst();        // remove the first element
        deque.pollLast();               // remove the last element
        deque.pop();            // pop  first element remove
        System.out.println(deque);


    }
}
