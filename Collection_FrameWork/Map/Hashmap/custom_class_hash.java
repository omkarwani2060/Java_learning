package Collection_FrameWork.Map.Hashmap;
import java.util.*;

public class custom_class_hash {
    public static void main(String[] args) {
        HashMap <student ,Integer> map = new HashMap<>();
        student s1 = new student("omkar",12);
        student s2 = new student("ganesh" , 11); // same content but this object store location are different
        student s3 = new student("mahesh", 10);
        student s4 = new student("ganesh" , 11);

        map.put(s1, 91);
        map.put(s2,75);
        map.put(s3,80);
        map.put(s4,90);

        System.out.println("Size of map : "+map.size());

        for(Map.Entry<student,Integer> i : map.entrySet()){
            System.out.println("Key  : "+ i.getKey() +"   Value = "+ i.getValue());
        }

        // access the s2 obj value
        System.out.println("S2 Obj value : "+map.get(s2));
        // access the s4 obj value
        System.out.println("S4 Obj value : "+map.get(s4));

    }
}

class student{
    private String name;
    private  Integer id;

    student(String name, Integer id){
        this.name= name;
        this.id = id;
    }
    String getName(){
        return name;
    }
    Integer getId(){
        return id;
    }

    @Override
    public  String toString(){
        return "Student : {name : "+ name +", Id : "+ id +"  }";
    }
}


