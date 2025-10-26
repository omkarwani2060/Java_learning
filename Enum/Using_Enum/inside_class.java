package Enum.Using_Enum;

public class inside_class {                                     // class in the enum
    enum name{
        Jagadeesh, Amit, Digu, Ajay
    }
    public static void main(String[] args) {
        for(name n1 : name.values()){
            System.out.print(n1 + "   ");
        }
    }
}
