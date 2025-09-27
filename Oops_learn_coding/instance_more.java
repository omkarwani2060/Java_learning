package Oops_learn_coding;

public class instance_more {
    {
        System.out.println("Instance block");
    }
    instance_more(){
        System.out.println("Constructor block");
    }
    void show(){
        System.out.println("Method block");
    }
    static{
        System.out.println("static block");
    }
    public static void main(String[] args) {

        instance_more obj = new instance_more();
        obj.show();
    }
}
