package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generics1 {

    public void method1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Omkar");
        list.add("mahesh");
        list.add("karan");

        System.out.println( list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
    public static void main(String[] args) {
        Generics1 g1 = new Generics1();
        g1.method1();
    }
}
