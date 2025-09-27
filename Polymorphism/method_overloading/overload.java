package Polymorphism.method_overloading;

public class overload {

    int add(){
        int a= 10, b = 20, c;
            c = a+b;
        return c;
    }
    void add(int x, int y){
        int c = x+y;
        System.out.println("2 parameter: "+c);
    }
    void add(int x , double y){
        double c = x + y;
        System.out.println("First para is int and second is double : " + c);
    }

    public static void main(String[] args) {
        overload o1 = new overload();
        int a =  o1.add();
        System.out.println("Default : "+a);
        o1.add(102, 100);
        o1.add(100, 263.2);
    }

}
