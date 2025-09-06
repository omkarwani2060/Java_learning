package method_scope;

public class blockscope {
    void num1(){
        {
            int a = 100;                      //block level scope;
            System.out.println(a);
        }
        for(int i=1 ; i <= 5; i++){
            System.out.println(i);
        }
        {
            System.out.println("hello World!..");
        }
    }

    public static void main(String[] args){
        blockscope obj = new blockscope();
        obj.num1();

    }
}
