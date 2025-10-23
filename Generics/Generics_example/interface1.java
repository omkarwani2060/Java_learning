package Generics.Generics_example;

interface container <T>{
    void demo(T item);
}

class box<T> implements container<T>{
    private T item;

    @Override
    public void demo(T item){
        this.item = item;
    }

    public T demo1(){
        return item;
    }
}
public class interface1{
    public static <T> void main(String[] args) {
        box <Integer> b1 = new box<>();
        b1.demo(7837);
        System.out.println("Value : -> "+b1.demo1());

        box <String> b2 = new box<>();
        b2.demo("Omkar..Wani");
        System.out.println("Name : -> "+b2.demo1());

    }
}
