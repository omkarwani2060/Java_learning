package Collection_FrameWork.List.Comparator;
import java.util.*;

class ascending implements Comparator <Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {            //Ascending Order
        return o1 - o2;
    }
}

class descending implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {            // Descending Order
        return o2 - o1;
    }
}


public class comparator1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(80);
        list.add(30);
        list.add(2);

        System.out.println("Original list: "+list);

        list.sort(new ascending());
        System.out.println("Ascending Order : "+list);

        list.sort(new descending());
        System.out.println("Descending Order : "+list);
    }

}
