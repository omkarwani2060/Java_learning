package Super_keyword;
class A1{
    int a = 10;
    A1(){
        System.out.println("Hello karan");
    }
    void show(){
        System.out.println("This is super class");
    }

}
public class super_combine extends A1 {
    int a = 20;
    super_combine(){
        System.out.println("Hello mahesh");
    }
    void show(){
        System.out.println("This is sub class");
        System.out.println(a);
        System.out.println(super.a);
        super.show();
    }
    public static void main(String[] args) {

        super_combine sb = new super_combine();
        sb.show();
    }
}
