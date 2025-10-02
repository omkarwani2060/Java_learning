package Interface.static_def;

interface A{
    public static void show(){
        System.out.println("can't override interface static method");
    }
}
public class stat_def implements A {
  //  @Override
    public static void show(){
        System.out.println("errors");
    }
    public static void main(String[] args) {
        A.show();
        stat_def sd = new stat_def();
        sd.show();
    }

}
