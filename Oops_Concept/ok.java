package Oops_Concept;
class A{
    int b = 12;
    String val = "raja";
    String name;
}

public class ok {
    public static void main(String[] args){
      A obj1 = new A();
      obj1.val = "surya";
      System.out.println(obj1.val);

      A obj2 = new A();
      obj2.name = "omkar";
        System.out.println(obj2.name);

    A obj3 = new A();
    System.out.println(obj3.b);
    }
}
