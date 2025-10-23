package Generics.Method_interface;

interface container<T,K>{
    void show(T key, K value);
}
class box2<T,K> implements container <T,K>{
    @Override
    public void show(T key, K value) {
        System.out.println("Key: "+ key+ " | Value: "+ value);
    }
}
public class Two_pair_interface {
    public static void main(String[] args) {
        box2 <Integer,String> b1 = new box2<>();
        b1.show(1,"Omkar");
        b1.show(2,"Mahesh");
        b1.show(3,"Karan");
        b1.show(4,"Amit");
    }
}
