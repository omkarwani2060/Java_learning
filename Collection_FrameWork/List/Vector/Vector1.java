package Collection_FrameWork.List.Vector;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>(5, 3); // initialcapacity , capacityIncrement
                        // by default capacity of vector are 10;
        v1.add("jay");
        v1.add("Omkar");                            // add element
        v1.addFirst("Ganesh");
        v1.addLast("Vijay");
        v1.add("Mahesh");
        System.out.println(v1);
        System.out.println("Capacity : "+v1.capacity());            // capacity are 5
        v1.add("Raj");
        v1.add("viraj");
        v1.add("Shivraj");
        System.out.println("Capacity : "+v1.capacity());            // capacity are 8
        v1.add("bhim");
        System.out.println("Capacity : "+v1.capacity());            // capacity are 11

        System.out.println("Vector :-" + v1);

        System.out.println(v1.get(3));                  // access the 3 index
        System.out.println(v1.get(5));

        v1.set(2,"ganu");                       //replace the value
        System.out.println(v1);

        System.out.println(v1.size());          //print size of Vector
        System.out.println(v1.capacity());          // print capacity of vector

        System.out.println(v1.firstElement());      //get access the first element
        System.out.println(v1.lastElement());       //get access the last element

        for(String a : v1){                     //Iterate for each loop
            System.out.print(a + "   ");
        }

    }
}
