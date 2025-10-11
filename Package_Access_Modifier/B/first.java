package Package_Access_Modifier.B;
import Package_Access_Modifier.A.*;

public class first extends demo{
    protected void  diff_pac(){
        System.out.println("Defirant package..");
    }

    public static void main(String[] args) {
        first f2 = new first();
        f2.hello();                     // public class access all class
        f2.bye();                          // protected class

    }
}
