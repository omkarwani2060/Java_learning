package Oops_learn_coding;

class demo{         // class demo
    int age = 18;                               // variable
    String name = "Omkar Wani";

    void method1(){                                 // methods
        System.out.println(age + "  " + name);
    }
}

class class_obj {
    public static void main(String[] args) {
        demo obj = new demo();          // first obj
        obj.method1();


        demo obj1;                      // second obj1
        obj1 = new demo();
        obj1.method1();

    }
}
