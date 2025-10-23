package Generics.bounded;

interface cont<T>{
    void show(T item);
    T display();
}
class box<T> implements cont<T> {
    T item;

    public void show(T item){
        this.item = item;
    }

     public T display(){
        return item;
    }
}

public class interface_class {
    public static void main(String[] args) {

        box<Integer> b1 = new box<>();
        b1.show(938);
        System.out.println(b1.display());

        box <String > b2 = new box<>();
        b2.show("omkar");
        System.out.println(b2.display());
    }


}


