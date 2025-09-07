package Arrays;

class demo{

   void demoarrays(){

       int[] num1 = new int[3];
       String[] str = new String[9];
       float[] weights = new float[3];

       num1[0] = 1;
       num1[1] = 3;
       num1[2] = 10;

       str[0] = "omkar";
       str[1] = "karan";
       str[2] = "mahesh";

       weights[0] = 50;
       weights[1] = 54.3f;
       weights[2] = 74.0f;

       System.out.println("length: "+ str.length);

       System.out.println(num1[0]);
       System.out.println(str[0]);
       System.out.println(weights[0]);

       System.out.println(num1[1]);
       System.out.println(str[1]);
       System.out.println(weights[1]);


       System.out.println(num1[2]);
       System.out.println(str[2]);
       System.out.println(weights[2]);

       String[] literal = {"mahesh", "ganesh" ,"bhim" ,"vijay"};
       System.out.println(literal[0]);
       System.out.println(literal[1]);
       System.out.println(literal[2]);
       System.out.println(literal[3]);
   }

}
public class arrays1 {
    public static void main(String[] args) {
        demo d = new demo();
        d.demoarrays();

    }
}
