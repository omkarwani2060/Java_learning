package Abstraction;

abstract class people{

    abstract void work();
    people(){
        System.out.println("worker");
    }
}
class company extends people{
    void work(){
        System.out.println(" the comapany work people ");
    }
}

class instute extends people{
    void work(){
        System.out.println("the instutute work people");
    }
}


public class abs_program1 {
    public static void main(String[] args) {
        company c1 = new company();
        c1.work();

        instute i1 = new instute();
        i1.work();
    }
}
