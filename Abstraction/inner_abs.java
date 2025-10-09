package Abstraction;

abstract class abs{
    abstract public void show();
}
public class inner_abs {
    public static void main(String[] args) {
        abs obj = new abs(){
            @Override
            public void show(){
                System.out.println("The Class Show the method..");
            }
        };
        obj.show();
    }
}
