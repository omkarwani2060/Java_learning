package Collection_FrameWork.Comparable;
import java.util.*;

public class campareto_method implements Comparable<campareto_method>{
    private int id;
    private String name;

    campareto_method(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(campareto_method s){
    //    return     this.id - s.id;                      //asceding order
        return   s.id - this.id;                    //descending order
    }

    public String toString(){
        return name +"  "+ id;
    }

    public static void main(String[] args) {
        List<campareto_method> student = new ArrayList<>();

        student.add(new campareto_method(123,"omkar"));
        student.add(new campareto_method(22,"Mahesh"));
        student.add(new campareto_method(31,"kajal"));
        student.add(new campareto_method(47,"varad"));
        student.add(new campareto_method(16,"Rahul"));

       // student.sort(null);         // first method

        Collections.sort(student);      //Second method

        System.out.println(student);

    }
}
