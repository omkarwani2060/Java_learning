package method_scope;

public class mcq3 {
    public static void temp(int p){
        int q = p;
        q = p-100;
    //    System.out.println(q);

    }
    public static void main(String[] args) {
        int p = 870;
        temp(p);
        System.out.println("p: "+ p);
    //    System.out.println(q);            because this formal parameter not access by main method
    }
}
