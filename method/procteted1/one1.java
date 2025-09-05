package method.procteted1;
// import method.procteted1.*;

public class one1 {
    protected String str1 = "i am public class.";

    void printinclass(){
        System.out.println(str1);
    }

    public static void main(String[] args){
        one1 obj = new one1();
        obj.printinclass();

        one2 obj2 = new one2();
        obj2.printoutclass();

//        pkout obj3 = new pkout();
//        obj3.inclassoutpk();
//
//        one3 obj4 = new one3();
//        obj4.classoutpackageout();

    }
}
class one2{
    void printoutclass(){
        one1 obj = new one1();
        // obj.printinclass();
      //  System.out.println(obj.str1+ "out side of class.");
    }


}