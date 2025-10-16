package String;
class A{
    void m1(){
        System.out.println("kjd");
    }
}
class B extends A{
    void m2(){
        System.out.println("kfjk");
    }
}
public class Str1 {

    public static void main(String[] args) {
        String str = "Omkar";
        System.out.println(str);
        String str2 = "Omkar";
        System.out.println(str2);
        System.out.println(str.concat(" Wani"));     // str concat "Wani" but they do not store str String.

        System.out.println(str);            // str String is Omkar.
                                            // String is immutable .
        System.out.println();

        str = str.concat(" Sadashiv wani.");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str);

        str = "Dada";
        System.out.println(str);

        String str4 = new String("String obj");         // new = create by heap area memory
        System.out.println(str4);                               // String =  are class and class are final.

        String str5 = new String("String obj");
        System.out.println(str5);

    }
}
