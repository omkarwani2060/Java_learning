package encapsulation;

class A{
    private int value;
    public void setValue(int number){
        value = number;
    }
    public int getvalue(){
        return value;
    }
}

public class first_program {
    public static void main(String[] args) {

        A a1 = new A();
        a1.setValue(100);
        int num = a1.getvalue();
        System.out.println(num);
    }
}
