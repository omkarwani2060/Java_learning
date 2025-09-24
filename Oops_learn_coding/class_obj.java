package Oops_learn_coding;

class demo{
    int age = 18;                               // variable
    String name = "Omkar Wani";

    void method1(){                                 // methods
        System.out.println(age + "  " + name);
    }
}
class class_obj {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.method1();

    }
}
