package Oops_learn_coding;

class over1{
    int num ; String name; float f;
    over1(){
        num = 14;
        name = "dada";
        f = 34.2f;
    }
    over1(int x){
        num = x;
    }
    over1(int x , String y){
        num  = x;
        name = y;
    }
    over1(String y){
        name = y;
    }
    over1(float z){
        f = z;
    }
}

public class Cons_overloading {
    public static void main(String[] args) {
        over1 o1 = new over1();
        over1 o2 = new over1(23);
        over1 o3 = new over1(30,"osw");
        over1 o4 = new over1("patil");
        over1 o5 = new over1(92.882f);

        System.out.println(o1.num + " " + o1.name + " " + o1.f);
        System.out.println(o2.num);
        System.out.println(o3.num + " " + o3.name);
        System.out.println(o4.name);
        System.out.println(o5.f);
        System.out.println(o5.num);         // this value is defoult value are called -> 0;
    }
}
