package Oops_learn_coding.outer_innter_class;

class A{
    int a;
    void m1(){
        System.out.println("Outter class");

        B obj = new B(98);
        obj.m2();
    }

    class B{
        int num ;

        B (int a){
            num = a;
            System.out.println("value of a : " + num);
        }
        void m2(){
            System.out.println("Inner class ");
        }
    }
}
public class in_out {
    public static void main(String[] args) {
        A obj2 = new A();
        obj2.m1();
    }
}
