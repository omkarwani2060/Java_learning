package Generics.Method_interface;

class box <T>{
    T item;

    box(T item){
        this.item = item;
    }
    public <U> void m1(U val){
        System.out.println("Item : "+ item);
        System.out.println("Value : "+ val);
    }
}
public class method4 {

    public static void main(String[] args) {

        box <Integer> b1 = new box<>(100);
        b1.m1("Omkar");

    }
}
