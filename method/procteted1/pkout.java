// package method.procteted1;
import method.procteted1.one1;

public class pkout{

    void inclassoutpk(){
        one1 obj = new one1();
      //  System.out.println(obj.str1+ "in class and out package.");
    }

    public static void main(String[] args) {
        pkout obj3 = new pkout();
        obj3.inclassoutpk();

        one1 obj = new one1();
      //  System.out.println(obj.str1+ "in class and out package.");

        one3 obj4 = new one3();
        obj4.classoutpackageout();
    }
}

// one3 -> child class
// one1 -> parent class
class one3 extends one1{
    void classoutpackageout(){
        one3 obj3 = new one3();
        System.out.println(obj3.str1+ " || out class and out package.");

    }


}
