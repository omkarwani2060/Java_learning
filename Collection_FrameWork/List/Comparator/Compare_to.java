package Collection_FrameWork.List.Comparator;
import java.util.*;

public class Compare_to  {
    private String name;
    private double val;

    Compare_to(String name , double val){
        this.name = name;
        this.val = val;
    }

    public String getname(){
        return name;
    }

    public double getval(){
        return val;
    }

    public static  void main(String[] args) {

        List <Compare_to> list1 = new ArrayList<>();

        list1.add(new Compare_to ("omakr" , 1.2));
        list1.add(new Compare_to ("Ganesh" , 1.5));
        list1.add(new Compare_to ("Mahesh" , 2.1));
        list1.add(new Compare_to ("Vijay" , 1.6));
        list1.add(new Compare_to("onkar" , 1.2));
        list1.add(new Compare_to("jay" , 1.5));




        Comparator<Compare_to> com = Comparator.comparing(Compare_to :: getval).reversed().thenComparing(Compare_to::getname);
        list1.sort(com);                        // print comparing method
                                            // ascending order


//        list1.sort((o1, o2) -> {                          // upper method and this sort method are some work
//            if((o2.getval() - o1.getval()) > 0){
//                return 1;
//            }
//            else if((o2.getval() - o1.getval())< 0){
//                return -1;
//            }
//            else{
//                return 0;
//            }
//        });


        for(Compare_to a : list1){
            System.out.println(a.getname() + "  " + a.getval() );
        }





    }
}
