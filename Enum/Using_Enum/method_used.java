package Enum.Using_Enum;
enum  method1{
    Omkar, Mahesh, Karan, Ajit, Amit
}
public class method_used {
    public static void main(String[] args) {            // Values() Method
        for(method1 m1 : method1.values()){
            System.out.print(m1 + "  ");
        }
        System.out.println();

        method1 m2 = method1.valueOf("Omkar");          // valueOf Method
        System.out.println("My name is : "+m2);

        int m3 = method1.Mahesh.ordinal();              // ordinal() Method ->  print the values of index
        System.out.println(m3);
    }
}
