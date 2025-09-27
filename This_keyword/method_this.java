package This_keyword;

public class method_this {
    int a;
    method_this(int a){
        this.a = a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        method_this a1 = new method_this(100);

    }
}
