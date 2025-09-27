package Super_keyword;

class A{
    int a = 20;

}
class B extends A{
    int a = 10;
    void m2(){
        System.out.println("A :" + super.a);            //super_variable
        System.out.println("B: "+ a);
    }
    public static void main(String[] args) {

        B b1 = new B();
        b1.m2();


    }
}