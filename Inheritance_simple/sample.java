package Inheritance_simple;

class sup1{                     // super class
    protected int num ; String name;
    void  ok(){
        System.out.println("ok");
    }
}
class sample extends sup1 {                 // sub class
    void non_ok(){
        num = 10; name = "Omkar";
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
            sample s1 = new sample();
            s1.ok();
            s1.non_ok();
    }
}
