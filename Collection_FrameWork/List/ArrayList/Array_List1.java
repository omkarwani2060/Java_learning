package Collection_FrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Array_List1 {
    public static void main(String[] args) {


        ArrayList<String> arr1 = new ArrayList<>();         // Create The Arraylist

        arr1.add("Omkar");          // add the element
        arr1.add("kalu");
        arr1.add("balu");
        arr1.add("dadya");
        arr1.add("Omkar");          // Duplicate value allow in Arraylist


        System.out.println("Index to 2 element : "+ arr1.get(2));   // get method the index of element access

        System.out.println("Array list : "+ arr1);      // print all element

        arr1.remove(2);                         // remove the index 2 no element

        for(String a : arr1){                       // arr1 are print
            System.out.print(a+ "  ");
        }
        System.out.println();

        arr1.add(2, "ganesh");      // add 2 index of element

        for(String a : arr1){                       // arr1 are print in for each loop
            System.out.print(a+ "  ");
        }
        System.out.println();

        arr1.set(2, "mahesh");                  // replace the value of 2 index

        for(String a : arr1){                       // arr1 are print
            System.out.print(a+ "  ");
        }
        System.out.println();

        // contains method();
        System.out.println(arr1.contains("dada"));          // the value are not available // false
        System.out.println(arr1.contains("Omkar"));         // the value are availabale    // true

        for(int i=0; i< arr1.size(); i++){                  // for loop in element
            System.out.print(arr1.get(i)+ "  ");
        }
        System.out.println();

        System.out.println("Arraylist size : "+arr1.size());      //  Arraylist size print
         // Arraylist are default

        arr1.clear();                                               // clear all element

        System.out.println(arr1);

        System.out.println(arr1.isEmpty());                         //Checks if list is empty


        List <String> arr2 = new ArrayList<>();                 // Create new ArrayList

        arr2.add("Dog");

        System.out.println(arr2);
    }
}
