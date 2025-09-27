package Oops_learn_coding;

class cls{
    int age = 18;
    String name = "DAda";

    void print_1(){
        System.out.println(age + "  "+ name);
    }
}
public class class_ex {
    public static void main(String[] args) {
        cls obj = new cls();
        obj.print_1();

        cls obj1 = new cls();
        obj1.age = 20;
        obj1.name = "Don";
        obj1.print_1();
    }
}
