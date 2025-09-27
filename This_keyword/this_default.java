package This_keyword;

public class this_default {
    this_default(){
        System.out.println(" hello");
    }
    this_default(int a){
        this();
        System.out.println(a);
                            // call the default constructor;
    }
    public static void main(String[] args) {
        this_default td = new this_default(10);
    }
}
