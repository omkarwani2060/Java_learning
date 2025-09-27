package This_keyword;

public class this_para {
    this_para(){
        this(10);           // this value
    }
    this_para(int a){
        System.out.println(a);          // use to the upper constructor
    }
    public static void main(String[] args) {
        this_para tp = new this_para();
    }
}
