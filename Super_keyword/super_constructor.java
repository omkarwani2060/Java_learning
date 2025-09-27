package Super_keyword;

class supe1{
    int a;
 supe1(){
     System.out.println("This super costructor ");
 }
 supe1(int a){
     System.out.println("This super costructor 1: " + a);
 }
}
public class super_constructor extends supe1{
    super_constructor(){                                            // super constuctor
        super(10);
        System.out.println("This sub constructor");
    }
    public static void main(String[] args) {

        super_constructor sc = new super_constructor();
    }
}
