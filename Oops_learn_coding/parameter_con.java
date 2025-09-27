package Oops_learn_coding;

class a112{
    int a ; String b ; boolean c;
    a112(){
        a =10;
        b = "Omkar";
        c= true;
   //     System.out.println(a+ " " + b+ " " + c);
    }
    void disp(){
        System.out.println(a+ " " + b+ " " + c);
    }
}
public class parameter_con {
    public static void main(String[] args) {
        a112 a = new a112();
        a.disp();

    }
}
