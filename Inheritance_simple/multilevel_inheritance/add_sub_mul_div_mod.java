package Inheritance_simple.multilevel_inheritance;

class A{                            // super class
    int a,b, c;
    void add(){
        int a = 10;
        int b = 20;
        c = a+b;
        System.out.println("Sum : " + c);
    }
    void sum(){
        int a = 10;
        int b = 20;
       c = a -b;
        System.out.println("Sub : "+ c);
    }
}
class B extends A{                                       // sub class 1
    void mul(){
        int a = 10;
        int b = 20;
        c = a*b;
        System.out.println("multiplication : " + c);
    }
    void div(){
        int a = 10;
        int b = 2;
        c = a / b;
        System.out.println("Division : "+ c);
    }
}
class C extends B{                                       // sub class 2
    void mod(){
        int a = 10;
        int b = 3;
        c = a % b;
        System.out.println("Module : "+ c);
    }
}

public class add_sub_mul_div_mod {
    public static void main(String[] args) {

        C c1 = new C();
        c1.add(); c1.sum(); c1.mul(); c1.div(); c1.mod();

    }
}
