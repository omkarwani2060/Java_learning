package Collection_FrameWork.Set;
import java.util.*;

enum name{Omkar, Mahesh, Kajal, Sneha, vipul, vaibhav, karan}

public class Enumset1 {
    public static void main(String[] args) {
        EnumSet <name> Name = EnumSet.allOf(name.class);
        System.out.println("Student Name : "+Name);     // all values

        EnumSet <name> Name2 = EnumSet.noneOf(name.class);
        System.out.println(Name2);          // empty set

        EnumSet <name> Name3 = EnumSet.of(name.karan,name.Omkar,name.Mahesh);
        System.out.println("Friends Name : "+Name3);        //values

        EnumSet <name> range = EnumSet.range(name.Mahesh,name.vaibhav);
        System.out.println(range);          // range of two element between



    }
}
