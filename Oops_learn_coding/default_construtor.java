package Oops_learn_coding;

class A1{
    int age; String name; float weight;
    A1(){
        age = 20;
        name = "Omkar";
        weight = 45.90f;
        System.out.println("name: " + name + "\n" + "age: " + age + "\n" + "weight: " + weight);
    }
}
public class default_construtor {
    public static void main(String[] args) {

        A1 obj = new A1();
    }
}
