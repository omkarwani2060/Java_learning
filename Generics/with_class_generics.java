package Generics;

public class  with_class_generics <T>  {
    private T val;

    public void setVal(T val){
        this.val = val;
    }

    public T getVal(){
        return val;
    }

    public static void main(String[] args) {

        with_class_generics <Integer> wcg = new with_class_generics<>();
        wcg.setVal(26);
        int i = wcg.getVal();
        System.out.println("With Generics  -> "+i);

        with_class_generics <String> wcg2 = new with_class_generics<>();
        wcg2.setVal("omkar");
        System.out.println(wcg2.getVal());
    }
}
