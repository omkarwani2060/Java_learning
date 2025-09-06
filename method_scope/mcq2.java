package method_scope;

public class mcq2 {
    public static void maketwice(int p){
        p = p*2;
    }
    public static void main(String[] args) {
        int p = 24;
        maketwice(p);
        System.out.println(p);
    }
}
