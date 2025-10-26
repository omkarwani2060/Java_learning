package Enum.Interface_using;


interface display{
    void print();
}
enum name implements display{
    Omkar, Shree, Kartik, Ganesh;

    public void print(){
        System.out.println("My name is : "+ this);
    }
}
public class enum_interface {
    public static void main(String[] args) {
        name n1 = name.Ganesh;
        n1.print();
    }
}
