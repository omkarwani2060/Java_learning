package Abstraction;

 abstract class programing{
    abstract void developer();
    abstract void rank();
}

abstract class python extends programing{
     @Override
     void developer(){
         System.out.println("Omkar wani ");
     }
}

class  java extends python{
     @Override
     void rank(){
         System.out.println("james Gosling");
     }
}

public class abstract_method {
    public static void main(String[] args) {
        programing j1= new java();
        j1.rank();
        j1.developer();

    }
}
