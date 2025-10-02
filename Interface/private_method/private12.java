package Interface.private_method;

interface A{
    static void call(){
        add(100, 200);
    }
//    default void call(){
//        add(100, 200);
//    }
    private static void add(int x, int y){            // static to that not need to object
        System.out.println("Sum :" + (x+y));
    }
}
class B implements A{
    public void  sub(int x, int y){
        System.out.println("Sub :" + (x-y));
    }
}

public class private12 {
    public static void main(String[] args) {
        B b1 = new B();
        A.call();
        //b1.call();            // use to default access modifier use that time.
        b1.sub(300, 200);

    }
}
