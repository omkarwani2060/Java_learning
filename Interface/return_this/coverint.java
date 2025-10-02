package Interface.return_this;


class A{
    A m1(){
        System.out.println("Hello ");
        int a = 20, b = 20, c;
        c = a+b;
        System.out.println("Sum : "+c);
        return this;
    }
}
class B extends A{

    @Override
    A m1(){
        super.m1();
        System.out.println("Bye");
        return this;
    }
}
public class coverint {
    public static void main(String[] args) {
        B a1 = new B();
        a1.m1();
      //  a1.m1();
    }
}
