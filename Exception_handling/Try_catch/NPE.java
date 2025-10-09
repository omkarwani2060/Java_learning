package Exception_handling.Try_catch;

public class NPE{
    public static void main(String[] args) {
         String str = null;
         try{
             System.out.println(str.toUpperCase());
         }catch (NullPointerException e){
             System.out.println("Exception : " + e);
         }
    }
}
