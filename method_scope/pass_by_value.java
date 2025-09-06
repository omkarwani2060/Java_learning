package method_scope;

public class pass_by_value {
    static void values(int a){
        a += 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
    int a = 10;

    System.out.println("the value before: "+ (a));
    values(a);
    System.out.println("the value after : "+ (a));

    }
}