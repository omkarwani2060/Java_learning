package Collection_FrameWork.List.Comparator;
import java.util.*;

class serial implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return  o1.length() -  o2.length();             // length wise print the element
    }
}
public class stringCompare {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Omkar");
        list.add("om");
        list.add("jay");
        list.add("shivraj");

        System.out.println("Original List: "+ list);

        list.sort(new serial());
        System.out.println("Serial : "+ list);
    }
}
