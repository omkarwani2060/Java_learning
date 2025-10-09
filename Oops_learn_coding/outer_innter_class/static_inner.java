package Oops_learn_coding.outer_innter_class;

class X{
    void m1(){
        System.out.println("outter class ");
    }

    static class Y{                                   // inner class in static
        void m2(){
            System.out.println("Inner class");
        }
    }
}
public class static_inner {
    public static void main(String[] args) {

        X x1 = new X();             // outter class
        x1.m1();

        X.Y y2 = new X.Y();             // intter class
        y2.m2();

    }
}
