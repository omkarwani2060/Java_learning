package Generics.Erasure;

public class Type_Erasure {
    Object item;  // Type erasure means that generics type information id removed by the java compiler during compilation..

    public void setItem(Object item){
        this.item = item;
    }

    public Object getItem(){
        return item;
    }

    public static void main(String[] args) {
        Type_Erasure TE = new Type_Erasure();

        TE.setItem(90);

        int a = (Integer) TE.getItem();
        System.out.println("Value :- "+a);
    }
}
