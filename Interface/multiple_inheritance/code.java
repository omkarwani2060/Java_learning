package Interface.multiple_inheritance;

interface A{
    void show();
    void display1();
}
interface B{
    void show();
    void display2();
}
public class code implements A,B {
    public void show(){                 // A & B interface access show
        System.out.println("Interface A & B");
    }

    public void display1(){                // A interface
        System.out.println("Interface A");
    }

    public void display2(){                 // B interface
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        code c = new code();
        c.show();
        c.display1();
        c.display2();
    }

}
