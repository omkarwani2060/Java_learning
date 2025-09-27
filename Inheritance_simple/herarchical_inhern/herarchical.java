package Inheritance_simple.herarchical_inhern;

class A{
    void input(){
        System.out.println("Enter your name: ");
    }
    void surname(){
        System.out.println("Enter surname : ");
    }
}

class B extends A{
    void show(){
        System.out.println("My name is Omakar");
    }
}

class C extends A{
    void show(){
        System.out.println("My surname is Wani");
    }
}
public class herarchical {
    public static void main(String[] args) {

         B b1 = new B();
         b1.input(); b1.show();

        C c1 = new C();
        c1.surname(); c1.show();
    }
}
