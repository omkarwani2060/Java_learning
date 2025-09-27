package Super_keyword;

class sup1{
    int a =10;
    void show(){
        System.out.println("Hello Dosto! ");
    }
    void dis(){
        System.out.println(a);
    }
}
public class super_method extends sup1 {
    void show(){
        super.show();                               // super methods
        super.dis();
        System.out.println("Hello Friends!.. ");
    }

    public static void main(String[] args) {
        super_method sm = new super_method();
        sm.show();
    }
}
