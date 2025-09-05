package method.public1;

public class outside_pk {

    void printfrompackage(){
        publick1 obj = new publick1();
        System.out.println(obj.str1+"out side of package");
    }
    public static void main(String[] args) {

        outside_pk obj3 = new outside_pk();
        obj3.printfrompackage();

        outside_class obj4 = new outside_class();
        obj4.printfrom_package_class();
    }
}
class outside_class{
    void printfrom_package_class(){
        publick1 obj5 = new publick1();
        System.out.println(obj5.str1+"out side of package and class");


    }
}
