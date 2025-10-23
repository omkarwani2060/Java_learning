package Generics.Wildcard;
import java.util.Arrays;
import java.util.List;

public class upper_bound {

    public static void method1(List <? extends Number>  list1){
        for(Number a : list1){
            System.out.print(a + "  ");
        }
    }
    public static void main(String[] args) {
        List <Integer> l1 = Arrays.asList(1,2,3,45,6,7);
        method1(l1);

//        List <String> l2 = Arrays.asList("Omkar","Mahesh","karan");
//        method1(l2);                                // error  that time the Number is not extends by String..;

    }
}
