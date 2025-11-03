package Collection_FrameWork.Extra_Info;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(13);
        arr.add(15);

        for(int i : arr){           // for for Each loop
            System.out.print(i + "   ");
        }
        System.out.println();


        Iterator<Integer> iterator = arr.iterator();        // Iterator class
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "   ");
        }
        System.out.println();


        Iterator<Integer> it = arr.iterator();        // Iterator class
        while(it.hasNext()){
                Integer val= it.next();
            System.out.print(val + "   ");
            if(val.equals(13)){
                it.remove();
            }
        }
        System.out.println();
        System.out.println(arr);
    }
}
