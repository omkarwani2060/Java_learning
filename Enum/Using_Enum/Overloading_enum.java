package Enum.Using_Enum;
                                    //Overloading in enum //

enum fruit{
    mongo{
        public void print(){
            System.out.println("Sweet Test ..");
        }
    },                                                     // use the Colan
    apple{
        public void print(){
            System.out.println("Good Health...");
        }
    };

    public abstract void print();
}
public class Overloading_enum {
    public static void main(String[] args) {
        fruit f1 = fruit.apple;
        f1.print();

        fruit f2 = fruit.mongo;
        f2.print();
    }
}
