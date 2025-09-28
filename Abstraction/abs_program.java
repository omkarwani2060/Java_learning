package Abstraction;

abstract class animal{
    animal(){
        System.out.println("all animals are 4 legs.");
    }
    void eat(){
        System.out.println("the all animals are eat");
    }
    abstract void sound();
}
class dog extends animal{
//    dog(){
//        System.out.println("This is dog..");
//    }
    void sound(){
        System.out.println("Dog is barking ");
//        super.eat();
    }
}

class indian extends dog{
    void  sound(){
        System.out.println("bhau bhau bhau..");
    }
    void loyal(){
        System.out.println("this is loyal");
    }

}

class lion extends animal{
    lion(){
        System.out.println("This is lion..");
    }
   void  sound(){
        System.out.println("lion is Roar...");
    }
}
class abs_program{
    public static void main(String[] args) {
        animal d = new dog();
        d.sound(); d.eat();

        dog d1 = new indian();
        d1.sound();

        indian l1 = new indian();
        l1.loyal();


        lion l = new lion();
        l.sound();
    }
}