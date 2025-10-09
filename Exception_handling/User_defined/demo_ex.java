package Exception_handling.User_defined;

class omkar extends Exception{
    omkar(String msg){
        System.out.println(msg);
    }
}
public class demo_ex{
    void m1(int a, int b) throws omkar{
        if(b == 0){
            throw new omkar("Omkar Wani");
        }
      //  System.out.println(a/ b);
    }

    public static void main(String[] args)throws Exception{
        demo_ex d1 = new demo_ex();
       try {
            d1.m1(10,0);
      }catch (Exception o){
           System.out.println("the omkar wani Exception is created..");
       }
    }
}