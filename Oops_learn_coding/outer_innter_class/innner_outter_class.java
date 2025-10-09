package Oops_learn_coding.outer_innter_class;

class outter{
    void method1(){
        int a = 2;
        System.out.println("Outter Method..");
    }
    class Innter{
        void method2(){
            System.out.println("Intter method..");

        }
    }
}
public class innner_outter_class {
    public static void main(String[] args) {
        outter o1 = new outter();
        o1.method1();

        outter.Innter i2 = o1.new Innter();
        i2.method2();

        // outter class.intter class object = outter class object.new intter class contruxtor.


    }
}
