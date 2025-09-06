package method_scope;

public class scope {
int a = 1;
int b = 5;
    int add(){
        return a+b;
    }

    int sub(){
        int r = 10;               // method level scope of variables
        int k = 7;
        return r-k;
    }

    public static void main(String[] args) {
        scope obj = new scope();
        System.out.println(obj.add());
        System.out.println(obj.sub());
    }
}
