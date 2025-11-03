package Collection_FrameWork.Map.WeakHashMap;

import java.util.WeakHashMap;

public class weakHashMap1 {
    private static void simutableapplication(){
        try{
            System.out.println("Simmulation applacation Running...");
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WeakHashMap <String,Image> weak1 = new WeakHashMap<>();

        weak1.put(new String("Mahesh")  , new Image("dada"));
        weak1.put(new String("Omkar"), new Image("bhau"));
        System.out.println(weak1);      // print value
        System.gc();
        simutableapplication();
        System.out.println("Cache after running Some : "+ weak1);           // print the value are Null

    }
}
class Image{
    private String Image1;
    Image(String Image1){
        this.Image1 = Image1;
    }

    @Override
    public String toString() {
        return " "+ Image1+" ";
    }

    public String getImage(){
        return Image1;
    }

}
