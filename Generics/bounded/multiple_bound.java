package Generics.bounded;

interface demo<T>{
    void show(T item);
    T display();
}
class test1 <T extends Number & Comparable<T>> {
    T item;

    public void show(T item){
        this.item = item;
    }

    public T display(){
        return item;
    }
}
public class multiple_bound {
    public static void main(String[] args) {
        test1 <Integer>t1 = new test1<>();
        t1.show(74);
        System.out.println("Number :-> "+ t1.display());
    }
}
