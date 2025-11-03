package Collection_FrameWork.List.Linked_list;
import java.util.*;
                                        // working process of Linked list class //
public class Linked1 {
    public static void main(String[] args) {
//        LinkedList <Node> list = new LinkedList<>();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.value = 1;                 //   node -> value | address
                                        //    node1 ->  1   | node2
        node1.next = node2;            //     node2 ->  2   | node3
        node2.value = 2;                //    node3 ->  3   | null
        node2.next = node3;
        node3.value = 3;
        node3.next = null;





    }
}
class Node{
    public int value;           // data value

    public  Node next;              // referunce the next Node
}
