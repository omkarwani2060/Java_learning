package String;

class demo{
    int num ;String name;
    demo(int num, String name){
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString(){
        return "roll no: "+ num + " Name : " + name ;
    }
}
public class ToString_method {
    public static void main(String[] args) {
        demo d1 = new demo(20, "omkar");
        System.out.println(d1);
    }
}
