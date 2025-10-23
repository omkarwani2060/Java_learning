package Generics.Method_interface;

interface one<T extends Number>{
    void show(T value);
}
class two<T extends Number> implements one<T>{
    public void show(T value){
        System.out.println("Value : - > "+ value);
    }
}
public class bounded_interface {
    public static void main(String[] args) {
        two <Integer> t1 = new two<>();
        t1.show(45);
    }
}
