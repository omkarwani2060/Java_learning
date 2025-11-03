package Collection_FrameWork.Map.Garbage_Collector;
import java.lang.ref.WeakReference;
import java.util.*;

class Demo1 {
    private String model;
    private String mobile;

    public Demo1(String model, String mobile) {
        this.model = model;
        this.mobile = mobile;
    }
    public String getmodel() {
        return model;
    }
    public String getMobile() {
        return mobile;
    }
    @Override
    public String toString() {
        return "{Model : " + model + " | Mobile : " + mobile + " }.";
    }
}

public class Weakreference {
        public static void main(String[] args) {

        WeakReference<Demo1> d2 = new WeakReference<>(new Demo1("galaxy f1","samsung"));
            System.out.println(d2.get());
            System.gc();                //the weak Reference are remove the object.
                                    //  Suggests JVM to run GC.
            try{
                Thread.sleep(10000);
            }
            catch(Exception ignored){
            }
                                            // garbage collestor are remove the object
            System.out.println(d2.get());       // print after Null
    }
}
