package method.public1;


public class publick1 {
    public String str1 ="this class is public.";

    void printfromclass(){
        System.out.println(str1);
    }
    public static void main(String[] args) {
        publick1 obj = new publick1();
        obj.printfromclass();

        publick2 obj2 = new publick2();
        obj2.printoutsideclass();

        outside_pk obj3 = new outside_pk();
        obj3.printfrompackage();

        outside_class obj5 = new outside_class();
        obj5.printfrom_package_class();
    }
}
class publick2{
    void printoutsideclass(){
        publick1 obj1 = new publick1();
        System.out.println(obj1.str1+"out side class");

    }
}
