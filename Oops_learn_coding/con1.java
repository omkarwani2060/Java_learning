package  Oops_learn_coding;

            // parametarized constructor
class demo12{
    int age;
    String name ;
    demo12(int age1 , String name1){
        age = age1;
        name = name1;
        System.out.println(age + " " + name);
    }
}

               // parameterezied constructor
class show{
    show(int num, String person){
        int num1 = num;
        String person1 = person;
        System.out.println(num1 +"  "+ person1);
    }
}

                        // default Constructor
class const1{
int age ;
String name ;
float weight;
    const1(){
        name = "babu kaka";
        age = 11;
        weight = 45.39f;
        System.out.println("name: " + name + " | age: "+ age + " | weight : " + weight);
        }
}

public class con1{
    public static void main(String[] args) {
        demo12 d1 = new demo12(12, "omkar");        // parameterized constructor calling
        show obj1 = new show(30,"Gotya");

        const1 con = new const1();              // default constructor calling
    }
}
