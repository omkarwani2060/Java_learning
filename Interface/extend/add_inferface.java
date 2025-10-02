package Interface.extend;

interface A{
 void add();
}
interface B extends A{
    void sub();
}

public class add_inferface implements B{
    public void add(){
        int a= 10, b= 20 ,c;
        c = a + b;
        System.out.println("Addition : " + c);
    }

    public void sub(){
        int a= 20, b =10,c;
        c = a-b;
        System.out.println("subtration : " + c);
    }

    public static void main(String[] args) {
        B ai = new add_inferface();
        ai.add();   ai.sub();
    }
}
