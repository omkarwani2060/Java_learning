package encapsulation;

class A1{
    private String name;
    private int num;

    public void set(int num , String name){
        this.name = name;
        this.num = num;
    }

    public int get1(){
        return num;
    }
    public String get(){
        return name;
    }
}
public class second_prograam {

    public static void main(String[] args) {

        A1 a1 = new A1();
        a1.set(20,"omkar");
        String name = a1.get();
        int num = a1.get1();
        System.out.println("name : " + name);
        System.out.println("num : " + num );
    }
}
