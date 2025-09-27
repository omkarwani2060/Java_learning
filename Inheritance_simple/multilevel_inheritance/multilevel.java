package Inheritance_simple.multilevel_inheritance;


class sup1{                             // super class
    int no ;
    void m1(){
        System.out.println(" This is Super ");
    }
}
class sub extends sup1{                     // first sub class
    String name;
    void m2(){
        System.out.println("This is sub class 1.");
    }
}
public class multilevel  extends sub{           // second muitilevel class
    int age ;
    void m3(){
        no = 39; name = "omkar" ; age = 20;
        System.out.println(no + " " + name + " " + age);
        System.out.println("this is sub class 2.");
    }
    public static void main(String[] args) {
        multilevel obj = new multilevel();
        obj.m3();
    }
}
