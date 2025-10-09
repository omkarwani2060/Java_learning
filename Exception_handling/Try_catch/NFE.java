package Exception_handling.Try_catch;

public class NFE {
    public static void main(String[] args) {

        String str = "HEllo";
        try{                         //this block exception are exceted that time execute catch block.
            int a = Integer.parseInt(str);
            System.out.println(a);
        }catch (NumberFormatException n){
            System.out.println("String "+ str +" does not convert into INT");
        }

                                                            // this block are excuted.
        String str1 = "123";                                // print number 123.
        try{
            int b = Integer.parseInt(str1);
            System.out.println("Number :" + b);
        }catch (NumberFormatException nfe){
            System.out.println(nfe);
        }


        String str2 =  "Ram ram";
        try{
            int x = Integer.parseInt(str2);
        }catch (Exception l ){
            System.out.println(l);
        }
        System.out.println("code ended..");

    }
}
