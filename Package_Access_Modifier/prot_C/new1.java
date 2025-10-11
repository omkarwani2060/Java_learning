package Package_Access_Modifier.prot_C;

public class new1 {
    protected  void m2(){
        System.out.println("Main class");
    }
    public static void main(String[] args) {
        new2 n1 = new new2();
        n1.m1();
    }
}

