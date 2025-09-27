package Oops_learn_coding;

class copy1{
    int num ; String name ;
    int num1; String name1;
    copy1(){
        num = 12;
        name = "Omkar";
        System.out.println(num + " " + name);
    }
    copy1(copy1 ref){
        num1 = ref.num;
        name1 = ref.name;
        System.out.println("num1 : "+ num1 + " name1 : "+ name);
    }
}

public class copy_constructor {
    public static void main(String[] args) {

        copy1 c1 = new copy1();
        copy1 c2 = new copy1(c1);
    }
}
