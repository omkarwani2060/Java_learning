package Conditional;

import java.util.Stack;

class on{
    void ok(){
        System.out.println("klka");
    }
}

public class  Main{
    int age;


    static{
        on o1 = new on();
        o1.ok();
        int l = 10;
        System.out.println(l);
        int b= 394;
        System.out.println(b);
    }
    static{
        on o1 = new on();
        o1.ok();
        int l = 11;
        System.out.println(l);
        int b= 394;
        System.out.println(b);
    }
     void mas(){
        System.out.println(age);

        System.out.println();
    }

    public static void main(String[] args) {

        Main m1 = new Main();
        m1.mas();

    }
}


