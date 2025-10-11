package Package_Access_Modifier.A;
import Package_Access_Modifier.B.first;
import Package_Access_Modifier.B.*;

public  class demo extends two {
    public  void hello(){
        System.out.println("hello");
    }
    private void m1(){
        System.out.println("hello world..");
    }

    protected  void bye(){
        System.out.println("bye bye dosto.. !");
    }
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.m1();

//        other d2 = new other();                       // the private class not access by other class
//        d2.m2();                                      //error

        other d3 = new other();                         // default method access
        d3.default1();
        d3.prot();                          //protected method.

        two t1 = new two();
        t1.show();

    }
}
class other{
    private  void m2(){                                     //only access in this class
        System.out.println("Other class ");
    }

    void default1(){
        System.out.println("default modifier in java..");
    }

    protected void prot(){             // protected modifier are access in package and subclass other package.
        System.out.println("This method is protected..");
    }


}
