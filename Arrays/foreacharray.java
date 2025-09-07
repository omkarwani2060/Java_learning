package Arrays;

public class foreacharray {

     void method1(){
      String[] str1 = new String[15];
      str1[0] = "kishor";
      str1[1] = "vijay";
      str1[2] = "mahavir";
      str1[3] = "kishori";
      str1[4] = "madhuri";

      for(String str : str1){
          System.out.print(str + " , ");          // all value access in array.
      }

    }
    public static void main(String[] args) {
        foreacharray obj = new foreacharray();
        obj.method1();          // call with only for static keyword
    }
}
