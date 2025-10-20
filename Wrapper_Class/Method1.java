package Wrapper_Class;

public class Method1 {
    public static void main(String[] args) {

        Integer num = 382;
        String str  = num.toString();
        System.out.println("toString Method :-> "+str);

        String str2 = "12345";
        int num3 = Integer.parseInt(str2);
        System.out.println("ParseInt Method :-> "+num3);

        String str3 = "12345.7873f";
        float num4 = Integer.parseInt(str2);
        System.out.println("ParseInt Method of Float :-> "+ num4);

        String str4 = "489389";
        Integer num5 = Integer.valueOf(str4);
        System.out.println("ValueOf Method :-> "+num5);

        Integer a = 74;
        Integer b = 74;                  // value are equal -> 0;  value are not equal ->1;
        System.out.println("compareTo method :-> "+a.compareTo(b));

        Float b1 = 67.3f;
        Float b2 = 67.3f;       // value return true or false . value same -> true & value different ->false
        System.out.println("Equals Method :-> " + b1.equals(b2));


        Integer val1 = 292;
        int m = val1.intValue();
        System.out.println("xxxValue method :-> " +m);



    }
}
