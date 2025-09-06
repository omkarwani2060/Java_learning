package method_scope;

public class formal_actual {
    int add(int a, int b){              // formal parameter
        return (a+b);
    }
    public static void main(String[] args) {
        formal_actual obj = new formal_actual();
        System.out.println(obj.add(2,5));          //actual parameter
    }
}
