package Oops_learn_coding;

public class private_constructor {
    int num ; String name;
    private private_constructor(){
        num = 12;
        name = "omkar ";
        System.out.println(num + "  " + name  );
    }
    void  method1(){
        System.out.println(num + "  " + name  );
    }
    public static void main(String[] args) {

        private_constructor pc = new private_constructor();         // <-- first time
        pc.method1();                   //     < ----  second time here

    }
}
