package Oops_learn_coding;


class A{
    int age; String name;
    A(){
        age = 18;
        name = "omkar";
        System.out.println(" hello omkar");
        System.out.println(age + " " + name);
    }

    void show(){
        System.out.println(age + " " + name);
    }
}
class real1 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();  int a = 10;
        String name = "Omkar";
    }
}

