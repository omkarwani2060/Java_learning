package Generics;

public class Generics2 {

    private Object val;

    public void setm1(Object val){
        this.val = val;
    }
    public Object getm2(){
        return  val;
    }
    public static void main(String[] args) {

        Generics2 gen = new Generics2();
        gen.setm1(5);
        int i = (int) gen.getm2();
        System.out.println("Without Generics :- > "+i);
    }
}
