package Recursion;

public class Reverse_string {
    static void rev(String val){
        if(val.isEmpty()){
            return;
        }
        rev(val.substring(1));
        System.out.print(val.charAt(0) + " ");
    }
    public static void main(String[] args) {
        System.out.println("Reversed String : ");
        rev("OMKAR");
    }
}
