package Generics.Method_interface;

interface demo <T>{
    void show(T val);
    T display();
}
class  box1 <T> implements demo<T>{
    T val;
    box1(T val){
        System.out.println("value: " + val);
    }

    public void show(T val){
        this.val = val;
    }

     public T display(){
        return val;
    }
}

public class interface1{
    public static void main(String[] args) {

        box1 <Integer> obj = new box1<>(200);
        obj.show(90);
        System.out.println("Value of Display : -> "+obj.display());

    }
}
