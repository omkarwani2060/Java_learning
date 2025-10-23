package Generics.bounded;

public class upperclass {
        public static <T extends Number> int demo(T num1 , T num2){
            return (num1.intValue() + num2.intValue() );
        }
    public static void main(String[] args) {
        System.out.println("Addition : " + demo(28,89));
        System.out.println("Add : "+ demo(50,50));

    }
}
