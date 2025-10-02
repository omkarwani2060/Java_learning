package Interface.Var_arg;

class A{
    void add(int ... a){
        int sum = 0;
//        for(int x : a){                       //  for eack loop
//            sum = sum + x;
//        }
        for(int i = 0; i < a.length; i++ ){             // for loop
            sum = sum + a[i];
        }
        System.out.println("Sum : "+ sum);
    }
}
public class Var {
    public static void main(String[] args) {

        A a1 = new A();
        a1.add();
        a1.add(20);
        a1.add(283, 2);
        a1.add(10,20,20);
        a1.add(10,20,30,40);
    }
}
